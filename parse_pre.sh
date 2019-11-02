#!/bin/bash
source ../commons/commons.sh
echo ">> Pre Parsing...";
echo ">> Pre Parsing > prepare GTFS files...";
rm -r input/gtfs;
unzip input/gtfs.zip -d input/gtfs;
checkResult $? false;
echo ">> Pre Parsing > prepare GTFS files... DONE";
JAVA_FILES_DIR="src/org/mtransit/parser/us_everett_transit_bus";
JAVA_STOPS_FILE="$JAVA_FILES_DIR/Stops.java";
echo ">> Pre Parsing > Set Java stops file...";
> $JAVA_STOPS_FILE; # empty file
echo "package org.mtransit.parser.us_everett_transit_bus;" >> $JAVA_STOPS_FILE;
echo "" >> $JAVA_STOPS_FILE;
echo "import java.util.HashMap;" >> $JAVA_STOPS_FILE;
echo "" >> $JAVA_STOPS_FILE;
echo "public class Stops {" >> $JAVA_STOPS_FILE;
echo "	public static HashMap<String, String> ALL_STOPS;" >> $JAVA_STOPS_FILE;
echo "	static {" >> $JAVA_STOPS_FILE;
echo "		HashMap<String, String> allStops = new HashMap<String, String>();" >> $JAVA_STOPS_FILE;
awk -F "\"*,\"*" '{print "		allStops.put(\"" $5 "\", \"" $1"\"); // " $2}' input/gtfs/stops.txt >> $JAVA_STOPS_FILE;
checkResult $? false;
echo "		ALL_STOPS = allStops;" >> $JAVA_STOPS_FILE;
echo "	}" >> $JAVA_STOPS_FILE;
echo "}" >> $JAVA_STOPS_FILE;
echo "" >> $JAVA_STOPS_FILE;
echo ">> Pre Parsing > Set Java stops file... DONE";
echo ">> Pre Parsing... DONE";
exit $RESULT;
