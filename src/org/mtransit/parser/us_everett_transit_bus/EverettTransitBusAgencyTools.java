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

	private static final String AGENCY_COLOR = AGENCY_COLOR_RED;

	@Override
	public String getAgencyColor() {
		return AGENCY_COLOR;
	}

	@Override
	public String getRouteColor(GRoute gRoute) {
		if (StringUtils.isEmpty(gRoute.getRouteColor()) || "284384".equalsIgnoreCase(gRoute.getRouteColor())) {
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
		map2.put(2l, new RouteTripSpec(2l, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MARINER_PARK_AND_RIDE) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { "57", "63", "1" })) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { "1", "47", "57" })) //
				.compileBothTripSort());
		map2.put(3l, new RouteTripSpec(3l, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, WEST_CASINO_ROAD) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { "19", "377", "200" })) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { "200", "347", "369", "19" })) //
				.compileBothTripSort());
		map2.put(4l, new RouteTripSpec(4l, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, COLLEGE_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { "87", "101", "67" })) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { "67", "76", "87" })) //
				.compileBothTripSort());
		map2.put(5l, new RouteTripSpec(5l, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, COLLEGE_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { "317", "321", "402" })) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { "402", "411", "424" })) //
				.compileBothTripSort());
		map2.put(6l, new RouteTripSpec(6l, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, HARBORFRONT, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { "425", "426", "432" })) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { "432", "438", "425" })) //
				.compileBothTripSort());
		map2.put(7l, new RouteTripSpec(7l, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, COLLEGE_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { "146", "458", "473" })) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { "473", "356", //
								"357", "369", // !=
								"500", "146" })) //
				.compileBothTripSort());
		map2.put(8l, new RouteTripSpec(8l, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, AIRPORT_RD) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { "553", "423", "114" })) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { "114", "501", "553" })) //
				.compileBothTripSort());
		map2.put(12l, new RouteTripSpec(12l, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION, //
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_STRING, WEST_CASINO_ROAD) //
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { "19", "30", "1" })) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { "1", "18", "41", "19" })) //
				.compileBothTripSort());
		map2.put(17l, new RouteTripSpec(17l, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { "146", "162", "114" })) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { "114", "133", "146" })) //
				.compileBothTripSort());
		map2.put(18l, new RouteTripSpec(18l, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_STRING, EVERETT_STATION, //
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_STRING, MUKILTEO) //
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { "177", "187", "199", "84", "86", "200" })) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { "200", "203", "225", "177" })) //
				.compileBothTripSort());
		map2.put(29l, new RouteTripSpec(29l, //
				MDirectionType.NORTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, COLLEGE_STATION, //
				MDirectionType.SOUTH.intValue(), MTrip.HEADSIGN_TYPE_STRING, MALL_STATION) //
				.addTripSort(MDirectionType.NORTH.intValue(), //
						Arrays.asList(new String[] { //
						"146", "290", "291", "292", //
								"331", "340", // !=
								"293", "298", // !=
								"262", "299", //
								"300", "254", "255", //
								"256", "257", //
								"258", "259", "301", //
								"226"
						})) //
				.addTripSort(MDirectionType.SOUTH.intValue(), //
						Arrays.asList(new String[] { //
						"226", //
								"253", "254", "255", //
								"256", "257", //
								"258", "259", "260", //
								"261", "262", "263", //
								"269", // ==
								"270", "276", // !=
								"341", "342", // !=
								"277", "146"
						})) //
				.compileBothTripSort());
		map2.put(70l, new RouteTripSpec(70l, //
				MDirectionType.EAST.intValue(), MTrip.HEADSIGN_TYPE_STRING, BOEING, //
				MDirectionType.WEST.intValue(), MTrip.HEADSIGN_TYPE_STRING, MUKILTEO) //
				.addTripSort(MDirectionType.EAST.intValue(), //
						Arrays.asList(new String[] { //
						"177", "522", //
								"41", "386", "387", "388", //
								"509", "382", "385"
						})) //
				.addTripSort(MDirectionType.WEST.intValue(), //
						Arrays.asList(new String[] { //
						"385", //
								"41", "386", "387", "388", //
								"510", "177"
						})) //
				.compileBothTripSort());
		ALL_ROUTE_TRIPS2 = map2;
	}

	@Override
	public int compareEarly(long routeId, List<MTripStop> list1, List<MTripStop> list2, MTripStop ts1, MTripStop ts2, GStop ts1GStop, GStop ts2GStop) {
		if (ALL_ROUTE_TRIPS2.containsKey(routeId)) {
			return ALL_ROUTE_TRIPS2.get(routeId).compare(routeId, list1, list2, ts1, ts2, ts1GStop, ts2GStop);
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
			return SplitUtils.splitTripStop(mRoute, gTrip, gTripStop, routeGTFS, ALL_ROUTE_TRIPS2.get(mRoute.getId()));
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
