package org.mtransit.parser.us_everett_transit_bus;

import static org.mtransit.commons.CleanUtils.SPACE;
import static org.mtransit.commons.StringUtils.EMPTY;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mtransit.commons.CleanUtils;
import org.mtransit.parser.ColorUtils;
import org.mtransit.parser.DefaultAgencyTools;
import org.mtransit.parser.gtfs.data.GStop;
import org.mtransit.parser.mt.data.MAgency;

import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

// https://www.soundtransit.org/Developer-resources/Data-downloads
// https://www.soundtransit.org/help-contacts/business-information/open-transit-data-otd/otd-downloads
// https://gtfs.sound.obaweb.org/prod/97_gtfs.zip
public class EverettTransitBusAgencyTools extends DefaultAgencyTools {

	public static void main(@NotNull String[] args) {
		new EverettTransitBusAgencyTools().start(args);
	}

	@Nullable
	@Override
	public List<Locale> getSupportedLanguages() {
		return LANG_EN;
	}

	@Override
	public boolean defaultExcludeEnabled() {
		return true;
	}

	@NotNull
	public String getAgencyName() {
		return "Everett Transit";
	}

	@NotNull
	@Override
	public Integer getAgencyRouteType() {
		return MAgency.ROUTE_TYPE_BUS;
	}

	@Override
	public boolean defaultRouteIdEnabled() {
		return true;
	}

	@Override
	public boolean useRouteShortNameForRouteId() {
		return true;
	}

	@Override
	public boolean defaultRouteLongNameEnabled() {
		return true;
	}

	@Override
	public boolean defaultAgencyColorEnabled() {
		return true;
	}

	private static final String AGENCY_COLOR_RED = "C92E36"; // RED (from web site CSS)

	private static final String AGENCY_COLOR = AGENCY_COLOR_RED;

	@NotNull
	@Override
	public String getAgencyColor() {
		return AGENCY_COLOR;
	}

	@Nullable
	@Override
	public String fixColor(@Nullable String color) {
		if (ColorUtils.BLACK.equalsIgnoreCase(color)) {
			return null;
		}
		return super.fixColor(color);
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

	@NotNull
	@Override
	public String cleanStopName(@NotNull String gStopName) {
		gStopName = _DASH_.matcher(gStopName).replaceAll(SPACE);
		gStopName = CleanUtils.toLowerCaseUpperCaseWords(getFirstLanguageNN(), gStopName, getIgnoredWords());
		gStopName = CleanUtils.SAINT.matcher(gStopName).replaceAll(CleanUtils.SAINT_REPLACEMENT);
		gStopName = CleanUtils.CLEAN_AND.matcher(gStopName).replaceAll(CleanUtils.CLEAN_AND_REPLACEMENT);
		gStopName = CleanUtils.CLEAN_AT.matcher(gStopName).replaceAll(CleanUtils.CLEAN_AT_REPLACEMENT);
		gStopName = CleanUtils.cleanSlashes(gStopName);
		gStopName = CleanUtils.cleanStreetTypes(gStopName);
		return CleanUtils.cleanLabel(gStopName);
	}

	@NotNull
	@Override
	public String getStopCode(@NotNull GStop gStop) {
		String stopCode = gStop.getStopCode();
		if (stopCode.equalsIgnoreCase("-1")) {
			stopCode = EMPTY;
		}
		return stopCode;
	}

	@Override
	public int getStopId(@NotNull GStop gStop) {
		final String stopCode = getStopCode(gStop);
		if (stopCode.isBlank()) {
			return super.getStopId(gStop); // fall back on stop ID
		}
		return Integer.parseInt(gStop.getStopCode()); // using stop code as stop ID
	}
}
