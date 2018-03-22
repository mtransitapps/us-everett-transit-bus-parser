package org.mtransit.parser.us_everett_transit_bus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.mtransit.parser.CleanUtils;
import org.mtransit.parser.DefaultAgencyTools;
import org.mtransit.parser.Pair;
import org.mtransit.parser.SplitUtils;
import org.mtransit.parser.SplitUtils.RouteTripSpec;
import org.mtransit.parser.Utils;
import org.mtransit.parser.gtfs.data.GCalendar;
import org.mtransit.parser.gtfs.data.GCalendarDate;
import org.mtransit.parser.gtfs.data.GRoute;
import org.mtransit.parser.gtfs.data.GSpec;
import org.mtransit.parser.gtfs.data.GStop;
import org.mtransit.parser.gtfs.data.GTrip;
import org.mtransit.parser.gtfs.data.GTripStop;
import org.mtransit.parser.mt.data.MAgency;
import org.mtransit.parser.mt.data.MDirectionType;
import org.mtransit.parser.mt.data.MRoute;
import org.mtransit.parser.mt.data.MTrip;
import org.mtransit.parser.mt.data.MTripStop;

// http://www.soundtransit.org/Developer-resources/Data-downloads
// http://developer.onebusaway.org/tmp/sound/gtfs/modified/97_gtfs.zip
// http://developer.onebusaway.org/tmp/sound/gtfs/modified_staged/97_gtfs.zip
public class EverettTransitBusAgencyTools extends DefaultAgencyTools {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			args = new String[3];
			args[0] = "input/gtfs.zip";
			args[1] = "../../mtransitapps/us-everett-transit-bus-android/res/raw/";
			args[2] = ""; // files-prefix
		}
		new EverettTransitBusAgencyTools().start(args);
	}

	private HashSet<String> serviceIds;

	@Override
	public void start(String[] args) {
		System.out.printf("\nGenerating Everett Transit bus data...");
		long start = System.currentTimeMillis();
		this.serviceIds = extractUsefulServiceIds(args, this, true);
		super.start(args);
		System.out.printf("\nGenerating Everett Transit bus data... DONE in %s.\n", Utils.getPrettyDuration(System.currentTimeMillis() - start));
	}

	@Override
	public boolean excludeCalendar(GCalendar gCalendar) {
		if (this.serviceIds != null) {
			return excludeUselessCalendar(gCalendar, this.serviceIds);
		}
		return super.excludeCalendar(gCalendar);
	}

	@Override
	public boolean excludeCalendarDate(GCalendarDate gCalendarDates) {
		if (this.serviceIds != null) {
			return excludeUselessCalendarDate(gCalendarDates, this.serviceIds);
		}
		return super.excludeCalendarDate(gCalendarDates);
	}

	@Override
	public boolean excludeTrip(GTrip gTrip) {
		if (this.serviceIds != null) {
			return excludeUselessTrip(gTrip, this.serviceIds);
		}
		return super.excludeTrip(gTrip);
	}

	@Override
	public Integer getAgencyRouteType() {
		return MAgency.ROUTE_TYPE_BUS;
	}

	@Override
	public long getRouteId(GRoute gRoute) {
		return Long.parseLong(gRoute.getRouteShortName()); // using route short name as route ID
	}

	private static final String AGENCY_COLOR_RED = "C92E36"; // RED (from web site CSS)

	private static final String AGENCY_COLOR = AGENCY_COLOR_RED;

	@Override
	public String getAgencyColor() {
		return AGENCY_COLOR;
	}

	@Override
	public String getRouteColor(GRoute gRoute) {
		if (StringUtils.isEmpty(gRoute.getRouteColor()) //
				|| "000000".equalsIgnoreCase(gRoute.getRouteColor()) //
				|| "284384".equalsIgnoreCase(gRoute.getRouteColor())) {
			int rsn = Integer.parseInt(gRoute.getRouteShortName());
			switch (rsn) {
			// @formatter:off
			case 2: return "F68580";
			case 3: return "F9A72B";
			case 4: return "F03561";
			case 5: return "F03561";
			case 6: return "1C50A0";
			case 7: return "E51535";
			case 8: return "67218D";
			case 12: return "1C6434";
			case 17: return "40B93C";
			case 18: return "72D2F7";
			case 29: return "656263";
			case 70: return "5A3716";
			// @formatter:on
			}
			if (isGoodEnoughAccepted()) {
				return null;
			}
			System.out.printf("\nUnexpected route color %s!\n", gRoute);
			System.exit(-1);
			return null;
		}
		return super.getRouteColor(gRoute);
	}

	private static final String PARK_AND_RIDE_SHORT = "P&R";
	private static final String AIRPORT_RD = "Airport Rd";
	private static final String BOEING = "Boeing";
	private static final String COLLEGE_STATION = "College Sta";
	private static final String DOWNTOWN = "Downtown";
	private static final String EVERETT = "Everett";
	private static final String EVERETT_STATION = EVERETT + " Sta";
	private static final String HARBORFRONT = "Harborfront";
	private static final String MALL_STATION = "Mall Sta";
	private static final String MARINER_PARK_AND_RIDE = "Mariner " + PARK_AND_RIDE_SHORT;
	private static final String MUKILTEO = "Mukilteo";
	private static final String WEST_CASINO_ROAD = "W Casino Rd";

	private static HashMap<Long, RouteTripSpec> ALL_ROUTE_TRIPS2;
	static {
		HashMap<Long, RouteTripSpec> map2 = new HashMap<Long, RouteTripSpec>();
		map2.put(2L, new RouteTripSpec(2L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MARINER_PARK_AND_RIDE) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2106"), // MARINER PARK AND RIDE - Bay 4
								Stops.ALL_STOPS.get("6279"), // 3RD AVE SE & 112TH ST SW - NB
								Stops.ALL_STOPS.get("6394"), // MALL STATION - BAY 2
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("6394"), // MALL STATION - BAY 2
								Stops.ALL_STOPS.get("5281"), // 112TH ST SE & 4TH AVE W - WB
								Stops.ALL_STOPS.get("2106"), // MARINER PARK AND RIDE - Bay 4
						})) //
				.compileBothTripSort());
		map2.put(3L, new RouteTripSpec(3L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, WEST_CASINO_ROAD) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("5000"), // W CASINO RD & AIRPORT RD - WB
								Stops.ALL_STOPS.get("5005"), // W CASINO RD & AIRPORT RD - EB
								Stops.ALL_STOPS.get("2430"), // EVERETT STATION - D2
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2430"), // EVERETT STATION - D2
								Stops.ALL_STOPS.get("5000"), // W CASINO RD & AIRPORT RD - WB
								Stops.ALL_STOPS.get("5005"), // W CASINO RD & AIRPORT RD - EB
						})) //
				.compileBothTripSort());
		map2.put(4L, new RouteTripSpec(4L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, COLLEGE_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, DOWNTOWN) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1390"), // PACIFIC AVE & NASSAU ST - WB
								Stops.ALL_STOPS.get("1053"), // COLLEGE STATION - BAY C - SB
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1053"), // COLLEGE STATION - BAY C - SB
								Stops.ALL_STOPS.get("1390"), // PACIFIC AVE & NASSAU ST - WB
						})) //
				.compileBothTripSort());
		map2.put(6L, new RouteTripSpec(6L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, HARBORFRONT, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2441"), // EVERETT STATION - D4
								Stops.ALL_STOPS.get("1120"), // 13TH ST & W MARINE VIEW DR - WB
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1120"), // 13TH ST & W MARINE VIEW DR - WB
								Stops.ALL_STOPS.get("2441"), // EVERETT STATION - D4
						})) //
				.compileBothTripSort());
		map2.put(7L, new RouteTripSpec(7L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, COLLEGE_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("6395"), // MALL STATION - BAY 1
								Stops.ALL_STOPS.get("1056"), // COLLEGE STATION - BAY F - NB
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1056"), // COLLEGE STATION - BAY F - NB
								Stops.ALL_STOPS.get("1367"), // ==
								Stops.ALL_STOPS.get("5120"), // !=
								Stops.ALL_STOPS.get("5000"), // !=
								Stops.ALL_STOPS.get("5125"), // ==
								Stops.ALL_STOPS.get("6395"), // MALL STATION - BAY 1
						})) //
				.compileBothTripSort());
		map2.put(8L, new RouteTripSpec(8L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, AIRPORT_RD) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("5288"), // AIRPORT RD & EVERGREEN WAY - NB
								Stops.ALL_STOPS.get("3484"), // ==
								Stops.ALL_STOPS.get("3673"), // xx
								Stops.ALL_STOPS.get("3663"), // xx
								Stops.ALL_STOPS.get("3442"), // !=
								Stops.ALL_STOPS.get("3677"), // !=
								Stops.ALL_STOPS.get("3673"), // xx
								Stops.ALL_STOPS.get("3663"), // xx
								Stops.ALL_STOPS.get("3430"), // ==
								Stops.ALL_STOPS.get("2441"), // EVERETT STATION - D4
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2441"), // EVERETT STATION - D4
								Stops.ALL_STOPS.get("3425"), // ==
								Stops.ALL_STOPS.get("3440"), // xx
								Stops.ALL_STOPS.get("3675"), // xx
								Stops.ALL_STOPS.get("3676"), // !=
								Stops.ALL_STOPS.get("3445"), // !=
								Stops.ALL_STOPS.get("3440"), // xx
								Stops.ALL_STOPS.get("3675"), // xx
								Stops.ALL_STOPS.get("3710"), // ==
								Stops.ALL_STOPS.get("5288"), // AIRPORT RD & EVERGREEN WAY - NB
						})) //
				.compileBothTripSort());
		map2.put(12L, new RouteTripSpec(12L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION, //
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_STRING, WEST_CASINO_ROAD) //
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("5005"), // W CASINO RD & AIRPORT RD - EB
								Stops.ALL_STOPS.get("5115"), // ++ E CASINO RD & EVERGREEN WAY - EB
								Stops.ALL_STOPS.get("6394"), // MALL STATION - BAY 2
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("6394"), // MALL STATION - BAY 2
								Stops.ALL_STOPS.get("5215"), // ++ 100TH ST SW & EVERGREEN WAY - WB
								Stops.ALL_STOPS.get("5007"), // == AIRPORT RD & KASCH PARK RD - NB
								Stops.ALL_STOPS.get("2327"), // != BOEING GATE E-72
								Stops.ALL_STOPS.get("5005"), // W CASINO RD & AIRPORT RD - EB
						})) //
				.compileBothTripSort());
		map2.put(17L, new RouteTripSpec(17L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, COLLEGE_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1052"), // COLLEGE STATION - BAY B - SB
								Stops.ALL_STOPS.get("6395"), // MALL STATION - BAY 1
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("6395"), // MALL STATION - BAY 1
								Stops.ALL_STOPS.get("1052"), // COLLEGE STATION - BAY B - SB
						})) //
				.compileBothTripSort());
		map2.put(18L, new RouteTripSpec(18L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION, //
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_STRING, MUKILTEO) //
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1465"), // MUKILTEO FERRY TERMINAL
								Stops.ALL_STOPS.get("426"), // ==
								Stops.ALL_STOPS.get("2315"), // !=
								Stops.ALL_STOPS.get("2325"), // !=
								Stops.ALL_STOPS.get("2886"), // !=
								Stops.ALL_STOPS.get("2324"), // !=
								Stops.ALL_STOPS.get("2430"), // EVERETT STATION - D2
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2430"), // EVERETT STATION - D2
								Stops.ALL_STOPS.get("1465"), // MUKILTEO FERRY TERMINAL
						})) //
				.compileBothTripSort());
		map2.put(29L, new RouteTripSpec(29L, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, COLLEGE_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("6395"), // MALL STATION - BAY 1
								Stops.ALL_STOPS.get("4231"), // !=
								Stops.ALL_STOPS.get("4159"), // <>
								Stops.ALL_STOPS.get("4151"), Stops.ALL_STOPS.get("4157"), Stops.ALL_STOPS.get("4154"), Stops.ALL_STOPS.get("4156"), // <>
								Stops.ALL_STOPS.get("4158"), // <>
								Stops.ALL_STOPS.get("4162"), // !=
								Stops.ALL_STOPS.get("1054"), // COLLEGE STATION - BAY D - NB
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1054"), // COLLEGE STATION - BAY D - NB
								Stops.ALL_STOPS.get("2340"), // == EVERETT STATION - F1 - SB
								Stops.ALL_STOPS.get("4161"), // == !=
								Stops.ALL_STOPS.get("4159"), // != <>
								Stops.ALL_STOPS.get("4151"), Stops.ALL_STOPS.get("4157"), Stops.ALL_STOPS.get("4154"), Stops.ALL_STOPS.get("4156"), // <>
								Stops.ALL_STOPS.get("4158"), // != <>
								Stops.ALL_STOPS.get("4232"), // == !=
								Stops.ALL_STOPS.get("6395"), // MALL STATION - BAY 1
						})) //
				.compileBothTripSort());
		map2.put(70L, new RouteTripSpec(70L, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_STRING, BOEING, //
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_STRING, MUKILTEO) //
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("1465"), // MUKILTEO FERRY TERMINAL
								Stops.ALL_STOPS.get("7380"), // !=
								Stops.ALL_STOPS.get("2327"), // <>
								Stops.ALL_STOPS.get("2905"), // <> PERIMETER RD & SEAWAY BLVD - EB
								Stops.ALL_STOPS.get("2484"), // <> AIRPORT RD & W CASINO RD - SB
								Stops.ALL_STOPS.get("1741"), // <>
								Stops.ALL_STOPS.get("2977"), // <> BOEING GATE E-68
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						Stops.ALL_STOPS.get("2484"), // <> AIRPORT RD & W CASINO RD - SB
								Stops.ALL_STOPS.get("1741"), // <>
								Stops.ALL_STOPS.get("2977"), // <> BOEING GATE E-68
								Stops.ALL_STOPS.get("2327"), // <>
								Stops.ALL_STOPS.get("2905"), // <> PERIMETER RD & SEAWAY BLVD - EB
								Stops.ALL_STOPS.get("7375"), // !=
								Stops.ALL_STOPS.get("1465"), // MUKILTEO FERRY TERMINAL
						})) //
				.compileBothTripSort());
		ALL_ROUTE_TRIPS2 = map2;
	}

	@Override
	public int compareEarly(long routeId, List<MTripStop> list1, List<MTripStop> list2, MTripStop ts1, MTripStop ts2, GStop ts1GStop, GStop ts2GStop) {
		if (ALL_ROUTE_TRIPS2.containsKey(routeId)) {
			return ALL_ROUTE_TRIPS2.get(routeId).compare(routeId, list1, list2, ts1, ts2, ts1GStop, ts2GStop, this);
		}
		return super.compareEarly(routeId, list1, list2, ts1, ts2, ts1GStop, ts2GStop);
	}

	@Override
	public ArrayList<MTrip> splitTrip(MRoute mRoute, GTrip gTrip, GSpec gtfs) {
		if (ALL_ROUTE_TRIPS2.containsKey(mRoute.getId())) {
			return ALL_ROUTE_TRIPS2.get(mRoute.getId()).getAllTrips();
		}
		return super.splitTrip(mRoute, gTrip, gtfs);
	}

	@Override
	public Pair<Long[], Integer[]> splitTripStop(MRoute mRoute, GTrip gTrip, GTripStop gTripStop, ArrayList<MTrip> splitTrips, GSpec routeGTFS) {
		if (ALL_ROUTE_TRIPS2.containsKey(mRoute.getId())) {
			return SplitUtils.splitTripStop(mRoute, gTrip, gTripStop, routeGTFS, ALL_ROUTE_TRIPS2.get(mRoute.getId()), this);
		}
		return super.splitTripStop(mRoute, gTrip, gTripStop, splitTrips, routeGTFS);
	}

	@Override
	public void setTripHeadsign(MRoute mRoute, MTrip mTrip, GTrip gTrip, GSpec gtfs) {
		if (ALL_ROUTE_TRIPS2.containsKey(mRoute.getId())) {
			return; // split
		}
		System.out.printf("\n%s: Unexpected trip %s!\n", mRoute.getId(), gTrip);
		System.exit(-1);
	}

	@Override
	public boolean mergeHeadsign(MTrip mTrip, MTrip mTripToMerge) {
		System.out.printf("\nUnexpected trips to merge: %s & %s!\n", mTrip, mTripToMerge);
		System.exit(-1);
		return false;
	}

	@Override
	public String cleanTripHeadsign(String tripHeadsign) {
		tripHeadsign = CleanUtils.cleanSlashes(tripHeadsign);
		tripHeadsign = CleanUtils.CLEAN_AT.matcher(tripHeadsign).replaceAll(CleanUtils.CLEAN_AT_REPLACEMENT);
		tripHeadsign = CleanUtils.CLEAN_AND.matcher(tripHeadsign).replaceAll(CleanUtils.CLEAN_AND_REPLACEMENT);
		tripHeadsign = CleanUtils.cleanNumbers(tripHeadsign);
		tripHeadsign = CleanUtils.cleanStreetTypes(tripHeadsign);
		return CleanUtils.cleanLabel(tripHeadsign);
	}

	@Override
	public String cleanStopName(String gStopName) {
		gStopName = gStopName.toLowerCase(Locale.ENGLISH);
		gStopName = CleanUtils.SAINT.matcher(gStopName).replaceAll(CleanUtils.SAINT_REPLACEMENT);
		gStopName = CleanUtils.CLEAN_AND.matcher(gStopName).replaceAll(CleanUtils.CLEAN_AND_REPLACEMENT);
		gStopName = CleanUtils.CLEAN_AT.matcher(gStopName).replaceAll(CleanUtils.CLEAN_AT_REPLACEMENT);
		gStopName = CleanUtils.cleanSlashes(gStopName);
		gStopName = CleanUtils.removePoints(gStopName);
		gStopName = CleanUtils.cleanStreetTypes(gStopName);
		return CleanUtils.cleanLabel(gStopName);
	}

	@Override
	public int getStopId(GStop gStop) {
		return Integer.parseInt(gStop.getStopCode()); // using stop code as stop ID
	}
}
