package org.mtransit.parser.us_everett_transit_bus;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mtransit.parser.CleanUtils;
import org.mtransit.parser.DefaultAgencyTools;
import org.mtransit.parser.MTLog;
import org.mtransit.parser.StringUtils;
import org.mtransit.parser.Utils;
import org.mtransit.parser.gtfs.data.GCalendar;
import org.mtransit.parser.gtfs.data.GCalendarDate;
import org.mtransit.parser.gtfs.data.GRoute;
import org.mtransit.parser.gtfs.data.GSpec;
import org.mtransit.parser.gtfs.data.GStop;
import org.mtransit.parser.gtfs.data.GTrip;
import org.mtransit.parser.mt.data.MAgency;
import org.mtransit.parser.mt.data.MRoute;
import org.mtransit.parser.mt.data.MTrip;

import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;

import static org.mtransit.parser.StringUtils.EMPTY;

// https://www.soundtransit.org/Developer-resources/Data-downloads
// https://www.soundtransit.org/help-contacts/business-information/open-transit-data-otd/otd-downloads
// http://developer.onebusaway.org/tmp/sound/gtfs/modified/97_gtfs.zip
// http://developer.onebusaway.org/tmp/sound/gtfs/modified_staged/97_gtfs.zip
public class EverettTransitBusAgencyTools extends DefaultAgencyTools {

	public static void main(@Nullable String[] args) {
		if (args == null || args.length == 0) {
			args = new String[3];
			args[0] = "input/gtfs.zip";
			args[1] = "../../mtransitapps/us-everett-transit-bus-android/res/raw/";
			args[2] = ""; // files-prefix
		}
		new EverettTransitBusAgencyTools().start(args);
	}

	@Nullable
	private HashSet<Integer> serviceIdInts;

	@Override
	public void start(@NotNull String[] args) {
		MTLog.log("Generating Everett Transit bus data...");
		long start = System.currentTimeMillis();
		this.serviceIdInts = extractUsefulServiceIdInts(args, this, true);
		super.start(args);
		MTLog.log("Generating Everett Transit bus data... DONE in %s.", Utils.getPrettyDuration(System.currentTimeMillis() - start));
	}

	@Override
	public boolean excludingAll() {
		return this.serviceIdInts != null && this.serviceIdInts.isEmpty();
	}

	@Override
	public boolean excludeCalendar(@NotNull GCalendar gCalendar) {
		if (this.serviceIdInts != null) {
			return excludeUselessCalendarInt(gCalendar, this.serviceIdInts);
		}
		return super.excludeCalendar(gCalendar);
	}

	@Override
	public boolean excludeCalendarDate(@NotNull GCalendarDate gCalendarDates) {
		if (this.serviceIdInts != null) {
			return excludeUselessCalendarDateInt(gCalendarDates, this.serviceIdInts);
		}
		return super.excludeCalendarDate(gCalendarDates);
	}

	@Override
	public boolean excludeTrip(@NotNull GTrip gTrip) {
		if (this.serviceIdInts != null) {
			return excludeUselessTripInt(gTrip, this.serviceIdInts);
		}
		return super.excludeTrip(gTrip);
	}

	@NotNull
	@Override
	public Integer getAgencyRouteType() {
		return MAgency.ROUTE_TYPE_BUS;
	}

	@Override
	public long getRouteId(@NotNull GRoute gRoute) {
		return Long.parseLong(gRoute.getRouteShortName()); // using route short name as route ID
	}

	private static final String AGENCY_COLOR_RED = "C92E36"; // RED (from web site CSS)

	private static final String AGENCY_COLOR = AGENCY_COLOR_RED;

	@NotNull
	@Override
	public String getAgencyColor() {
		return AGENCY_COLOR;
	}

	@SuppressWarnings("DuplicateBranchesInSwitch")
	@Nullable
	@Override
	public String getRouteColor(@NotNull GRoute gRoute) {
		String routeColor = gRoute.getRouteColor();
		if ("000000".equalsIgnoreCase(routeColor)
				|| "284384".equalsIgnoreCase(routeColor)) {
			routeColor = null;
		}
		if (StringUtils.isEmpty(routeColor)) {
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
			throw new MTLog.Fatal("Unexpected route color %s!", gRoute);
		}
		return super.getRouteColor(gRoute);
	}

	@Override
	public void setTripHeadsign(@NotNull MRoute mRoute, @NotNull MTrip mTrip, @NotNull GTrip gTrip, @NotNull GSpec gtfs) {
		mTrip.setHeadsignString(
				cleanTripHeadsign(gTrip.getTripHeadsignOrDefault()),
				gTrip.getDirectionIdOrDefault()
		);
	}

	@Override
	public boolean directionFinderEnabled() {
		return true;
	}

	private static final Pattern ENDS_WITH_BAY_ = Pattern.compile("((^|\\W)(b:\\w+)(\\W|$))", Pattern.CASE_INSENSITIVE);
	private static final String ENDS_WITH_BAY_REPLACEMENT = "$2" + "$4";

	private static final Pattern ENDS_WITH_D_ = Pattern.compile("((^|\\W)(d\\w+)(\\W|$))", Pattern.CASE_INSENSITIVE);
	private static final String ENDS_WITH_D_REPLACEMENT = "$2" + "$4";

	private static final Pattern ENDS_WITH_I_ = Pattern.compile("((\\s*-\\s*)?(i\\d+)(?=(\\W|$)))", Pattern.CASE_INSENSITIVE);
	private static final String ENDS_WITH_I_REPLACEMENT = EMPTY;

	private static final Pattern ENDS_WITH_BOUNDS_ = Pattern.compile("((^|\\W)(nb|sb|eb|wb)(\\W|$))", Pattern.CASE_INSENSITIVE);
	private static final String ENDS_WITH_BOUNDS_REPLACEMENT = "$2" + "$4";

	@NotNull
	@Override
	public String cleanDirectionHeadsign(boolean fromStopName, @NotNull String directionHeadSign) {
		directionHeadSign = super.cleanDirectionHeadsign(fromStopName, directionHeadSign);
		directionHeadSign = ENDS_WITH_BAY_.matcher(directionHeadSign).replaceAll(ENDS_WITH_BAY_REPLACEMENT);
		directionHeadSign = ENDS_WITH_D_.matcher(directionHeadSign).replaceAll(ENDS_WITH_D_REPLACEMENT);
		directionHeadSign = ENDS_WITH_I_.matcher(directionHeadSign).replaceAll(ENDS_WITH_I_REPLACEMENT);
		directionHeadSign = ENDS_WITH_BOUNDS_.matcher(directionHeadSign).replaceAll(ENDS_WITH_BOUNDS_REPLACEMENT);
		return CleanUtils.cleanLabel(directionHeadSign);
	}

	@Override
	public boolean mergeHeadsign(@NotNull MTrip mTrip, @NotNull MTrip mTripToMerge) {
		throw new MTLog.Fatal("Unexpected trips to merge: %s & %s!", mTrip, mTripToMerge);
	}

	@NotNull
	@Override
	public String cleanTripHeadsign(@NotNull String tripHeadsign) {
		tripHeadsign = CleanUtils.cleanSlashes(tripHeadsign);
		tripHeadsign = CleanUtils.CLEAN_AT.matcher(tripHeadsign).replaceAll(CleanUtils.CLEAN_AT_REPLACEMENT);
		tripHeadsign = CleanUtils.CLEAN_AND.matcher(tripHeadsign).replaceAll(CleanUtils.CLEAN_AND_REPLACEMENT);
		tripHeadsign = CleanUtils.cleanNumbers(tripHeadsign);
		tripHeadsign = CleanUtils.cleanStreetTypes(tripHeadsign);
		return CleanUtils.cleanLabel(tripHeadsign);
	}

	private String[] getIgnoredWords() {
		return new String[]{
				"SB", "NB", "WB", "EB",
		};
	}

	private static final Pattern _DASH_ = Pattern.compile("( - )", Pattern.CASE_INSENSITIVE);
	private static final String _DASH_REPLACEMENT = " ";

	@NotNull
	@Override
	public String cleanStopName(@NotNull String gStopName) {
		gStopName = _DASH_.matcher(gStopName).replaceAll(_DASH_REPLACEMENT);
		gStopName = CleanUtils.toLowerCaseUpperCaseWords(Locale.ENGLISH, gStopName, getIgnoredWords());
		gStopName = CleanUtils.SAINT.matcher(gStopName).replaceAll(CleanUtils.SAINT_REPLACEMENT);
		gStopName = CleanUtils.CLEAN_AND.matcher(gStopName).replaceAll(CleanUtils.CLEAN_AND_REPLACEMENT);
		gStopName = CleanUtils.CLEAN_AT.matcher(gStopName).replaceAll(CleanUtils.CLEAN_AT_REPLACEMENT);
		gStopName = CleanUtils.cleanSlashes(gStopName);
		gStopName = CleanUtils.cleanStreetTypes(gStopName);
		return CleanUtils.cleanLabel(gStopName);
	}

	@Override
	public int getStopId(@NotNull GStop gStop) {
		return Integer.parseInt(gStop.getStopCode()); // using stop code as stop ID
	}
}
