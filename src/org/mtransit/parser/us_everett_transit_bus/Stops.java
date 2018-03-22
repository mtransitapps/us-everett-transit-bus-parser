package org.mtransit.parser.us_everett_transit_bus;

import java.util.HashMap;

public class Stops {
	public static HashMap<String, String> ALL_STOPS;
	static {
		HashMap<String, String> allStops = new HashMap<String, String>();
		allStops.put("stop_code", "stop_id"); // stop_name
		allStops.put("6394", "1"); // MALL STATION - BAY 2
		allStops.put("5281", "10"); // 112TH ST SE & 4TH AVE W - WB
		allStops.put("3575", "100"); // BEVERLY LN & 75TH ST SE - NB
		allStops.put("3570", "101"); // BEVERLY LN & 72ND ST SE - NB
		allStops.put("3555", "102"); // BEVERLY LN & MADISON - NB
		allStops.put("3548", "103"); // BEVERLY LN & TAMARACK DR - NB
		allStops.put("3505", "104"); // BEVERLY LN & PECKS - NB
		allStops.put("3370", "105"); // BEVERLY LN & 58TH ST SE - NB
		allStops.put("3360", "106"); // BEVERLY LN & SUNSET LN - NB
		allStops.put("3350", "107"); // DOGWOOD DR & 50TH ST SW - NB
		allStops.put("3335", "108"); // DOGWOOD DR & 48TH ST SW - NB
		allStops.put("3075", "109"); // W MUKILTEO BLVD & DOGWOOD DR - EB
		allStops.put("5283", "11"); // 112TH ST SW & 8TH AVE W - WB
		allStops.put("3035", "110"); // E MUKILTEO BLVD & FOREST PARK DR - EB
		allStops.put("3040", "111"); // E MUKILTEO BLVD & 42ND ST - EB
		allStops.put("3020", "112"); // 41ST ST & RUCKER AVE - EB
		allStops.put("1543", "113"); // COLBY AVE & 41ST ST - NB
		allStops.put("1515", "114"); // COLBY AVE & 39TH ST - NB
		allStops.put("1505", "115"); // COLBY AVE & 36TH ST - NB
		allStops.put("1495", "116"); // COLBY AVE & 34TH ST - NB
		allStops.put("1485", "117"); // COLBY AVE & 32ND ST - NB
		allStops.put("2466", "118"); // WETMORE AVE & WALL ST - NB
		allStops.put("1360", "119"); // WETMORE AVE & HEWITT AVE - NB
		allStops.put("5206", "12"); // 112TH ST SW & EVERGREEN WAY - WB
		allStops.put("1295", "120"); // WETMORE AVE & EVERETT AVE - NB
		allStops.put("1305", "121"); // EVERETT AVE & OAKES AVE - EB
		allStops.put("2245", "122"); // EVERETT AVE & BROADWAY - EB
		allStops.put("2270", "123"); // EVERETT AVE & BAKER AVE - EB
		allStops.put("2906", "124"); // CEDAR ST & HEWITT AVE - SB
		allStops.put("2325", "125"); // PACIFIC AVE & FULTON ST - WB
		allStops.put("2328", "126"); // BOEING GATE E-84
		allStops.put("1748", "127"); // BOEING GATE E-67
		allStops.put("1053", "128"); // COLLEGE STATION - BAY C - SB
		allStops.put("2010", "129"); // N BROADWAY & 7TH ST - NB
		allStops.put("5212", "13"); // 112TH ST SW & 16TH AVE W - WB
		allStops.put("2000", "130"); // E MARINE VIEW DR & BELMONTE LN - SB
		allStops.put("2015", "131"); // E MARINE VIEW DR & HAWTHORNE ST - SB
		allStops.put("2017", "132"); // E MARINE VIEW DR & 10TH ST  - SB
		allStops.put("2070", "133"); // E MARINE VIEW DR & 12TH ST - SB
		allStops.put("2115", "134"); // WALNUT ST & 15TH ST - SB
		allStops.put("2130", "135"); // WALNUT ST & 17TH ST - SB
		allStops.put("2150", "136"); // WALNUT ST & 19TH ST - SB
		allStops.put("2155", "137"); // WALNUT ST & LEONARD DR - SB
		allStops.put("2165", "138"); // WALNUT ST & 22ND ST - SB
		allStops.put("2180", "139"); // 23RD ST & STATE ST- EB
		allStops.put("5216", "14"); // 112TH ST SW & PAINE FIELD WAY - WB
		allStops.put("2195", "140"); // 23RD ST & SUMMIT AVE - EB
		allStops.put("2210", "141"); // HARRISON AVE & 25TH ST - SB
		allStops.put("2305", "142"); // HARRISON AVE & EVERETT AVE - SB
		allStops.put("2300", "143"); // EVERETT AVE & SUMMIT AVE - WB
		allStops.put("2282", "144"); // MAPLE ST & EVERETT AVE - SB
		allStops.put("2315", "145"); // MAPLE ST & PACIFIC AVE - SB
		allStops.put("2331", "146"); // PACIFIC AVE & CEDAR ST - WB
		allStops.put("2340", "147"); // EVERETT STATION - F1 - SB
		allStops.put("2323", "148"); // 33RD ST & MCDOUGALL AVE - WB
		allStops.put("1457", "149"); // PACIFIC AVE & LOMBARD AVE - WB
		allStops.put("5265", "15"); // AIRPORT RD & 112TH ST SW - SB
		allStops.put("2356", "150"); // PACIFIC AVE & ROCKEFELLER AVE - WB
		allStops.put("1383", "151"); // WALL ST & HOYT AVE - WB
		allStops.put("1373", "152"); // WALL ST & GRAND AVE - WB
		allStops.put("1390", "153"); // PACIFIC AVE & NASSAU ST - WB
		allStops.put("1378", "154"); // WALL ST & GRAND AVE - EB
		allStops.put("1388", "155"); // WALL ST & COLBY AVE - EB
		allStops.put("2359", "156"); // PACIFIC AVE & ROCKEFELLER AVE - EB
		allStops.put("1450", "157"); // LOMBARD AVE & PACIFIC AVE - NB
		allStops.put("2886", "158"); // BROADWAY & WALL ST - SB
		allStops.put("2324", "159"); // 33RD ST & MCDOUGALL AVE - EB
		allStops.put("1301", "16"); // AIRPORT RD & EVERGREEN WAY - EB
		allStops.put("2445", "160"); // EVERETT STATION - E1
		allStops.put("2335", "161"); // PACIFIC AVE & CEDAR ST - EB
		allStops.put("2310", "162"); // MAPLE ST & HEWITT AVE - NB
		allStops.put("2290", "163"); // EVERETT AVE & WALNUT ST - EB
		allStops.put("2295", "164"); // EVERETT AVE & HIGHLAND AVE - EB
		allStops.put("2215", "165"); // HARRISON AVE & 26TH ST - NB
		allStops.put("2205", "166"); // HARRISON AVE & 24TH ST - NB
		allStops.put("2190", "167"); // 23RD ST & SUMMIT AVE - WB
		allStops.put("2185", "168"); // 23RD ST & STATE ST - WB
		allStops.put("2160", "169"); // WALNUT ST & 22ND ST - NB
		allStops.put("1299", "17"); // AIRPORT RD & ADMIRALTY WAY - EB
		allStops.put("2145", "170"); // WALNUT ST & 19TH ST - NB
		allStops.put("2125", "171"); // WALNUT ST & 17TH ST - NB
		allStops.put("2120", "172"); // WALNUT ST & 15TH ST - NB
		allStops.put("2075", "173"); // E MARINE VIEW DR & 13TH ST - NB
		allStops.put("2025", "174"); // E MARINE VIEW DR & 10TH ST - NB
		allStops.put("2005", "175"); // E MARINE VIEW DR & BUTLER ST - NB
		allStops.put("2001", "176"); // E MARINE VIEW DR & BELMONTE LN - NB
		allStops.put("1035", "177"); // N BROADWAY & 8TH ST - SB
		allStops.put("1328", "178"); // N BROADWAY & TOWER ST - SB
		allStops.put("2441", "179"); // EVERETT STATION - D4
		allStops.put("168", "18"); // AIRPORT RD & E GIBSON RD - EB
		allStops.put("2887", "180"); // BROADWAY & PACIFIC AVENUE - NB
		allStops.put("2440", "181"); // HEWITT AVE & LOMBARD AVE - WB
		allStops.put("1355", "182"); // HEWITT AVE & ROCKEFELLER AVE - WB
		allStops.put("1375", "183"); // HEWITT AVE & WETMORE AVE - WB
		allStops.put("1380", "184"); // HEWITT AVE & HOYT AVE - WB
		allStops.put("1358", "185"); // HEWITT AVE & GRAND AVE - WB
		allStops.put("1268", "186"); // W MARINE VIEW DR & CALIFORNIA ST - NB
		allStops.put("1260", "187"); // W MARINE VIEW DR & 26TH ST - NB
		allStops.put("1225", "188"); // W MARINE VIEW DR & 18TH ST - NB
		allStops.put("1120", "189"); // 13TH ST & W MARINE VIEW DR - WB
		allStops.put("167", "19"); // 128TH ST SW & 8TH AVE W - EB
		allStops.put("1123", "190"); // W MARINE VIEW DR & 14TH ST - SB
		allStops.put("1125", "191"); // W MARINE VIEW DR & 16TH ST - SB
		allStops.put("1230", "192"); // W MARINE VIEW DR & 19TH ST - SB
		allStops.put("1265", "193"); // W MARINE VIEW DR & 26TH ST - SB
		allStops.put("1263", "194"); // W MARINE VIEW DR & CALIFORNIA ST - SB
		allStops.put("1357", "195"); // HEWITT AVE & GRAND AVE - EB
		allStops.put("1385", "196"); // HEWITT AVE & HOYT AVE - EB
		allStops.put("1365", "197"); // HEWITT AVE & WETMORE - EB
		allStops.put("426", "198"); // HEWITT AVE & OAKES AVE - EB
		allStops.put("1056", "199"); // COLLEGE STATION - BAY F - NB
		allStops.put("6105", "2"); // SE EVERETT MALL WAY & W MALL DR - WB
		allStops.put("2106", "20"); // MARINER PARK AND RIDE - Bay 4
		allStops.put("1060", "200"); // N BROADWAY & 10TH ST - SB
		allStops.put("1170", "201"); // BROADWAY & 12TH ST - SB
		allStops.put("1318", "202"); // BROADWAY & 14TH ST - SB
		allStops.put("1180", "203"); // BROADWAY & 16TH ST - SB
		allStops.put("1185", "204"); // BROADWAY & 18TH ST - SB
		allStops.put("1190", "205"); // BROADWAY & 19TH ST - SB
		allStops.put("1195", "206"); // BROADWAY & 21ST ST - SB
		allStops.put("1235", "207"); // BROADWAY & 23RD ST - SB
		allStops.put("1315", "208"); // BROADWAY & 25TH ST - SB
		allStops.put("9973", "209"); // BROADWAY & CALIFORNIA - SB
		allStops.put("6288", "21"); // 4TH AVE W & 124TH ST SW - NB
		allStops.put("1410", "210"); // RUCKER AVE & PACIFIC AVE - SB
		allStops.put("1477", "211"); // RUCKER AVE & 33RD ST - SB
		allStops.put("1480", "212"); // RUCKER AVE & 35TH ST - SB
		allStops.put("1525", "213"); // RUCKER AVE & 37TH ST - SB
		allStops.put("1535", "214"); // RUCKER AVE & 39TH ST - SB
		allStops.put("3010", "215"); // RUCKER AVE & 41ST ST - SB
		allStops.put("3270", "216"); // EVERGREEN WAY & 44TH ST SE - SB
		allStops.put("3285", "217"); // EVERGREEN WAY & 47TH ST SE - SB
		allStops.put("3320", "218"); // EVERGREEN WAY & 50TH ST SE - SB
		allStops.put("3650", "219"); // EVERGREEN WAY & 52ND ST SE - SB
		allStops.put("6284", "22"); // 4TH AVE W & 120TH ST SW - NB
		allStops.put("3645", "220"); // EVERGREEN WAY & 57TH ST SE - SB
		allStops.put("3640", "221"); // EVERGREEN WAY & 59TH ST SE - SB
		allStops.put("3635", "222"); // EVERGREEN WAY & PECKS DR - SB
		allStops.put("3630", "223"); // EVERGREEN WAY & 6500 BLK - SB
		allStops.put("3625", "224"); // EVERGREEN WAY & MADISON ST - SB
		allStops.put("3620", "225"); // EVERGREEN WAY & 73RD - SB
		allStops.put("3615", "226"); // EVERGREEN WAY & 75TH ST SE - SB
		allStops.put("3610", "227"); // EVERGREEN WAY & BRUIN BLVD - SB
		allStops.put("5125", "228"); // EVERGREEN WAY & E CASINO RD - SB
		allStops.put("5136", "229"); // EVERGREEN WAY & 86TH - SB
		allStops.put("6282", "23"); // 4TH AVE W & 116TH PL SW - NB
		allStops.put("5150", "230"); // EVERGREEN WAY & HOLLY DR - SB
		allStops.put("5160", "231"); // EVERGREEN WAY & 92ND ST SW - SB
		allStops.put("5175", "232"); // EVERGREEN WAY & W INTERCITY AVE - SB
		allStops.put("5185", "233"); // EVERGREEN WAY & 4TH AVE W - SB
		allStops.put("5190", "234"); // EVERGREEN WAY & 100TH ST SW - SB
		allStops.put("6245", "235"); // SW EVERETT MALL WAY & 4TH AVE W - EB
		allStops.put("6238", "236"); // SE EVERETT MALL WAY & MERIDIAN AVE - EB
		allStops.put("6395", "237"); // MALL STATION - BAY 1
		allStops.put("6230", "238"); // SE EVERETT MALL WAY & 3RD AVE SE - WB
		allStops.put("6235", "239"); // SE EVERETT MALL WAY & 1ST DR - WB
		allStops.put("6291", "24"); // 112TH ST SW & 4TH AVE W - EB
		allStops.put("6240", "240"); // SW EVERETT MALL WAY & 1ST PL W - WB
		allStops.put("6244", "241"); // SW EVERETT MALL WAY & 4TH AVE W - WB
		allStops.put("6265", "242"); // EVERGREEN WAY & SW EVERETT MALL WAY - NB
		allStops.put("6270", "243"); // EVERGREEN WAY & 100TH ST SW - NB
		allStops.put("6277", "244"); // EVERGREEN WAY & 4TH AVE W - NB
		allStops.put("5180", "245"); // EVERGREEN WAY & W MARILYN AVE - NB
		allStops.put("5170", "246"); // EVERGREEN WAY & W INTERCITY AVE - NB
		allStops.put("5155", "247"); // EVERGREEN WAY & 92ND ST SW - NB
		allStops.put("5145", "248"); // EVERGREEN WAY & HOLLY DR - NB
		allStops.put("5135", "249"); // EVERGREEN WAY & 86TH - NB
		allStops.put("6293", "25"); // 112TH ST SE & 1ST AVE SE - EB
		allStops.put("5130", "250"); // EVERGREEN WAY & CASINO RD - NB
		allStops.put("877", "251"); // EVERGREEN WAY & 79TH PL SE - NB
		allStops.put("3605", "252"); // EVERGREEN WAY & BRUIN BLVD - NB
		allStops.put("3168", "253"); // EVERGREEN WAY & 75TH ST SE - NB
		allStops.put("3622", "254"); // EVERGREEN WAY & 71ST - NB
		allStops.put("3628", "255"); // EVERGREEN WAY & MADISON ST - NB
		allStops.put("3638", "256"); // EVERGREEN WAY & BERKSHIRE DR - NB
		allStops.put("3642", "257"); // EVERGREEN WAY & 57TH ST SE - NB
		allStops.put("3647", "258"); // EVERGREEN WAY & HIGHWAY PL - NB
		allStops.put("3325", "259"); // EVERGREEN WAY & 52ND ST SE - NB
		allStops.put("6279", "26"); // 3RD AVE SE & 112TH ST SW - NB
		allStops.put("3315", "260"); // EVERGREEN WAY & 50TH ST SE - NB
		allStops.put("3290", "261"); // EVERGREEN WAY & WILMINGTON AVE - NB
		allStops.put("3255", "262"); // RUCKER AVE & 43RD ST SE - NB
		allStops.put("1537", "263"); // RUCKER AVE & 39TH ST - NB
		allStops.put("1520", "264"); // RUCKER AVE & 37TH ST - NB
		allStops.put("1475", "265"); // RUCKER AVE & 35TH ST - NB
		allStops.put("1466", "266"); // RUCKER AVE & 33RD ST - NB
		allStops.put("1460", "267"); // RUCKER AVE & 32ND ST - NB
		allStops.put("9967", "268"); // BROADWAY & CALIFORNIA - NB
		allStops.put("2240", "269"); // BROADWAY & 26TH ST - NB
		allStops.put("6275", "27"); // 3RD AVE SE & 106TH ST SE - NB
		allStops.put("2175", "270"); // BROADWAY & 23RD ST - NB
		allStops.put("2170", "271"); // BROADWAY & 21ST ST - NB
		allStops.put("2140", "272"); // BROADWAY & 19TH ST - NB
		allStops.put("2135", "273"); // BROADWAY & 18TH ST - NB
		allStops.put("2085", "274"); // BROADWAY & 15TH ST - NB
		allStops.put("827", "275"); // BROADWAY & 13TH ST - NB
		allStops.put("2367", "276"); // BROADWAY & 34TH ST - SB
		allStops.put("1553", "277"); // BROADWAY & 36TH ST - SB
		allStops.put("2366", "278"); // BROADWAY & 38TH ST - SB
		allStops.put("4008", "279"); // BROADWAY & 45TH ST SE - SB
		allStops.put("6273", "28"); // 3RD AVE SE & 102ND ST SE - NB
		allStops.put("4220", "280"); // BROADWAY & 53RD ST SE - SB
		allStops.put("4210", "281"); // BROADWAY & 56TH ST SE - SB
		allStops.put("4200", "282"); // BROADWAY & 60TH ST SE - SB
		allStops.put("4190", "283"); // BROADWAY & 62ND ST SE - SB
		allStops.put("4180", "284"); // BROADWAY & MELVIN AVE - SB
		allStops.put("4175", "285"); // MADISON ST & JEFFERSON AVE - WB
		allStops.put("4165", "286"); // MADISON ST & COMMERCIAL AVE - WB
		allStops.put("4135", "287"); // MADISON ST & BEVERLY BLVD - WB
		allStops.put("4140", "288"); // MADISON ST & HIGHLAND DR - WB
		allStops.put("4148", "289"); // MADISON ST & BERKSHIRE DR - WB
		allStops.put("6225", "29"); // SE EVERETT MALL WAY & 3RD AVE SE - EB
		allStops.put("3536", "290"); // MADISON ST & CADY RD - WB
		allStops.put("3538", "291"); // MADISON ST & BEVERLY LN - WB
		allStops.put("3490", "292"); // BROOKRIDGE BLVD & 1ST PL SE - WB
		allStops.put("3380", "293"); // BROOKRIDGE BLVD & 1ST AVE SE - WB
		allStops.put("3390", "294"); // BROOKRIDGE BLVD & 1ST DR W - WB
		allStops.put("3400", "295"); // BROOKRIDGE BLVD & 4TH DR W - WB
		allStops.put("3415", "296"); // MERRILL CREEK PKWY & GLENWOOD AVE - WB
		allStops.put("3425", "297"); // MERRILL CREEK PKWY & 13TH AVE W - WB
		allStops.put("3440", "298"); // HARDESON RD & MERRILL CREEK PKWY - SB
		allStops.put("3660", "299"); // HARDESON RD & 64TH ST SW - SB
		allStops.put("6095", "3"); // SE EVERETT MALL WAY & 10TH AVE SE - WB
		allStops.put("6090", "30"); // SE EVERETT MALL WAY & 7TH AVE SE - EB
		allStops.put("3665", "300"); // HARDESON RD & 70TH ST SW - SB
		allStops.put("3668", "301"); // HARDESON RD & SHUKSAN WAY - SB
		allStops.put("3670", "302"); // HARDESON RD & 72ND ST SW - SB
		allStops.put("3675", "303"); // HARDESON RD & 75TH ST SW - SB
		allStops.put("3676", "304"); // 75TH ST SW & 16TH AVE W - WB
		allStops.put("3680", "305"); // 75TH ST SW & SEAWAY BLVD - WB
		allStops.put("3485", "306"); // SEAWAY BLVD & FLUKE DR - NB
		allStops.put("3480", "307"); // SEAWAY BLVD & 24TH AVE W - WB
		allStops.put("3475", "308"); // MERRILL CREEK PKWY & SEAWAY BLVD - NB
		allStops.put("3455", "309"); // MERRILL CREEK PKWY & 64TH ST - EB
		allStops.put("6100", "31"); // SE EVERETT MALL WAY & 11TH AVE SE - EB
		allStops.put("3450", "310"); // MERRILL CREEK PKWY & 23RD DR W - EB
		allStops.put("3445", "311"); // MERRILL CREEK PKWY & 20TH AVE W - EB
		allStops.put("3710", "312"); // HARDESON RD & 77TH - SB
		allStops.put("3715", "313"); // HARDESON RD & 80TH ST SW - SB
		allStops.put("5195", "314"); // EVERGREEN WAY & OLIVIA PARK RD - SB
		allStops.put("5200", "315"); // EVERGREEN WAY & 108TH ST SW - SB
		allStops.put("5205", "316"); // EVERGREEN WAY & 110TH ST SE - SB
		allStops.put("5210", "317"); // EVERGREEN WAY & 112TH ST SW - SB
		allStops.put("5310", "318"); // EVERGREEN WAY & 116TH - SB
		allStops.put("5288", "319"); // AIRPORT RD & EVERGREEN WAY - NB
		allStops.put("6397", "32"); // 100TH ST & WEST MALL DR - EB - DROP OFF ONLY
		allStops.put("5217", "320"); // 112TH ST SW & AIRPORT RD - EB
		allStops.put("5213", "321"); // 112TH ST SW & 17TH CT SW - EB
		allStops.put("5300", "322"); // EVERGREEN CENTER & 112TH ST SW - NB
		allStops.put("6295", "323"); // EVERGREEN WAY & 112TH ST SW - NB
		allStops.put("3720", "324"); // HARDESON RD & UPPER RIDGE RD - NB
		allStops.put("3705", "325"); // HARDESON RD & 77TH - NB
		allStops.put("3484", "326"); // HARDESON RD & VERALENE WAY - NB
		allStops.put("3673", "327"); // HARDESON RD & 75TH ST SW - NB
		allStops.put("3667", "328"); // HARDESON RD & SHUKSAN WAY- NB
		allStops.put("3479", "329"); // HARDESON RD & SHUKSAN WAY - NB
		allStops.put("2430", "33"); // EVERETT STATION - D2
		allStops.put("3664", "330"); // HARDESON RD & 65TH ST SW - NB
		allStops.put("3663", "331"); // HARDESON RD & MERRILL CREEK PKWY - NB
		allStops.put("3442", "332"); // MERRILL CREEK PKWY & HARDESON RD - WB
		allStops.put("3443", "333"); // MERRILL CREEK PKWY & 20TH AVE W - WB
		allStops.put("3447", "334"); // MERRILL CREEK PKWY & 23RD DR W - WB
		allStops.put("3446", "335"); // MERRILL CREEK PKWY & 64TH ST - WB
		allStops.put("3457", "336"); // MERRILL CREEK PKWY & SEAWAY BLVD - SB
		allStops.put("3483", "337"); // SEAWAY BLVD & MERRILL CREEK PKWY - SB
		allStops.put("3486", "338"); // SEAWAY BLVD & FLUKE DR - SB
		allStops.put("3473", "339"); // 75TH ST SW & SEAWAY BLVD - EB
		allStops.put("3006", "34"); // CEDAR ST & HEWITT  - NB
		allStops.put("3677", "340"); // 75TH ST SW & 16TH AVE W - EB
		allStops.put("3430", "341"); // MERRILL CREEK PKWY & HARDESON RD - EB
		allStops.put("3420", "342"); // MERRILL CREEK PKWY & 13TH AVE W - EB
		allStops.put("3410", "343"); // MERRILL CREEK PKWY & GLENWOOD AVE - EB
		allStops.put("3405", "344"); // BROOKRIDGE BLVD & SEAHURST AVE - EB
		allStops.put("3395", "345"); // BROOKRIDGE BLVD & 3RD DR W - EB
		allStops.put("3385", "346"); // BROOKRIDGE BLVD & 60TH PL SE - EB
		allStops.put("3383", "347"); // BROOKRIDGE BLVD & 59TH PL SE - EB
		allStops.put("3495", "348"); // BROOKRIDGE BLVD & 1ST DR SE - EB
		allStops.put("3537", "349"); // MADISON ST & MORGAN RD - EB
		allStops.put("2275", "35"); // EVERETT AVE & CEDAR ST - WB
		allStops.put("4150", "350"); // MADISON ST & RAINIER DR - EB
		allStops.put("4145", "351"); // MADISON ST & OLYMPIC DR - EB
		allStops.put("4125", "352"); // MADISON ST & BEVERLY BLVD - EB
		allStops.put("4160", "353"); // MADISON ST & COMMERCIAL AVE - EB
		allStops.put("4170", "354"); // MADISON ST & JEFFERSON AVE - EB
		allStops.put("4185", "355"); // BROADWAY & HOWARD AVE - NB
		allStops.put("4195", "356"); // BROADWAY & 62ND ST SE - NB
		allStops.put("4205", "357"); // BROADWAY & 60TH ST SE - NB
		allStops.put("4215", "358"); // BROADWAY & 56TH ST SE - SB
		allStops.put("4223", "359"); // BROADWAY & 52ND ST SE - NB
		allStops.put("2260", "36"); // EVERETT AVE & RAINIER AVE - WB
		allStops.put("4007", "360"); // BROADWAY & 45TH ST SE - NB
		allStops.put("2364", "361"); // BROADWAY & 38TH ST - NB
		allStops.put("1552", "362"); // BROADWAY & 36TH ST - NB
		allStops.put("2365", "363"); // BROADWAY & 34th ST - NB
		allStops.put("3425", "364"); // MERRILL CREEK PKWY & 13TH AVE W - WB
		allStops.put("5288", "365"); // AIRPORT RD & EVERGREEN WAY - NB
		allStops.put("5215", "366"); // 100TH ST SW & EVERGREEN WAY - WB
		allStops.put("5220", "367"); // 100TH ST SW & HOLLY DR - WB
		allStops.put("5225", "368"); // 100TH ST SW & 12TH AVE W - WB
		allStops.put("5230", "369"); // 100TH ST SW & 15TH AVE W - WB
		allStops.put("1310", "37"); // EVERETT AVE & LOMBARD AVE - WB
		allStops.put("5235", "370"); // 100TH ST SW & 18TH AVE W - WB
		allStops.put("5240", "371"); // 100TH ST SW & 23RD AVE W - WB
		allStops.put("5245", "372"); // 100TH ST SW & AIRPORT RD - WB
		allStops.put("5011", "373"); // AIRPORT RD & 94TH ST SW - NB
		allStops.put("5007", "374"); // AIRPORT RD & KASCH PARK RD - NB
		allStops.put("5132", "375"); // E CASINO RD & EVERGREEN WAY - EB
		allStops.put("6000", "376"); // 7TH AVE SE & 84TH ST SE - SB
		allStops.put("6035", "377"); // 7TH AVE SE & 87TH ST SE - SB
		allStops.put("6045", "378"); // 7TH AVE SE & 90TH PL SE - SB
		allStops.put("6060", "379"); // 7TH AVE SE & 92ND ST SE - SB
		allStops.put("1290", "38"); // WETMORE AVE & EVERETT AVE - SB
		allStops.put("6070", "380"); // 7TH AVE SE & 94TH ST SE - SB
		allStops.put("6075", "381"); // 7TH AVE SE & SE EVERETT MALL WAY - SB
		allStops.put("1052", "382"); // COLLEGE STATION - BAY B - SB
		allStops.put("1011", "383"); // W MARINE VIEW DR & BRIDGE WAY - WB
		allStops.put("1076", "384"); // ALVERSON BLVD & 2ND ST - SB
		allStops.put("1082", "385"); // WETMORE AVE & ALVERSON BLVD  - SB
		allStops.put("1084", "386"); // WETMORE AVE & 6TH ST - SB
		allStops.put("1092", "387"); // WETMORE AVE & 8TH ST - SB
		allStops.put("1113", "388"); // COLBY AVE & 10TH ST - SB
		allStops.put("1145", "389"); // COLBY AVE & 13TH ST - SB
		allStops.put("1370", "39"); // WETMORE AVE & HEWITT AVE - SB
		allStops.put("1150", "390"); // COLBY AVE & 15TH ST - SB
		allStops.put("1165", "391"); // COLBY AVE & 17TH ST - SB
		allStops.put("1205", "392"); // COLBY AVE & 19TH ST - SB
		allStops.put("1215", "393"); // COLBY AVE & 21ST ST - SB
		allStops.put("1245", "394"); // COLBY AVE & 23RD ST - SB
		allStops.put("1255", "395"); // COLBY AVE & 25TH ST - SB
		allStops.put("1275", "396"); // COLBY AVE & 26TH ST - SB
		allStops.put("3000", "397"); // COLBY AVE & 41ST ST - SB
		allStops.put("3265", "398"); // COLBY AVE & 43RD ST SE - SB
		allStops.put("3275", "399"); // COLBY AVE & 45TH ST SE - SB
		allStops.put("6080", "4"); // SE EVERETT MALL WAY & 7TH AVE SE - WB
		allStops.put("2355", "40"); // WETMORE AVE & WALL ST - SB
		allStops.put("3300", "400"); // COLBY AVE & 47TH ST SE - SB
		allStops.put("3310", "401"); // COLBY AVE & 50TH ST SE - SB
		allStops.put("4070", "402"); // COLBY AVE & 52ND ST SE - SB
		allStops.put("4085", "403"); // COLBY AVE & FAIRFAX AVE - SB
		allStops.put("4095", "404"); // COLBY AVE & 60TH ST SE - SB
		allStops.put("4105", "405"); // BEVERLY BLVD & 63RD ST SE - SB
		allStops.put("4115", "406"); // BEVERLY BLVD & PALM AVE - SB
		allStops.put("4130", "407"); // BEVERLY BLVD & MADISON - SB
		allStops.put("4155", "408"); // BEVERLY BLVD & 72ND ST SE - SB
		allStops.put("4230", "409"); // BEVERLY BLVD & 75TH ST SE - SB
		allStops.put("1425", "41"); // COLBY AVE & PACIFIC AVE - SB
		allStops.put("4239", "410"); // E CASINO RD & HIGHLAND DR - SB
		allStops.put("4250", "411"); // E  CASINO RD & RAINIER DR - WB
		allStops.put("4255", "412"); // E CASINO RD & XAVIER WAY - WB
		allStops.put("4270", "413"); // E CASINO RD & 8TH AVE SE - WB
		allStops.put("6190", "414"); // 100TH ST SE & 7TH AVE SE - EB
		allStops.put("6195", "415"); // 100TH ST SE & 100TH PL SE - EB
		allStops.put("6085", "416"); // 7TH AVE SE & SE EVERETT MALL WAY - NB
		allStops.put("6065", "417"); // 7TH AVE SE & 93RD ST SE - NB
		allStops.put("6055", "418"); // 7TH AVE SE & 92ND ST SE - NB
		allStops.put("6050", "419"); // 7TH AVE SE & 90TH PL SE - NB
		allStops.put("1490", "42"); // COLBY AVE & 32ND ST - SB
		allStops.put("6040", "420"); // 7TH AVE SE & 87TH ST SE - NB
		allStops.put("6005", "421"); // 7TH AVE SE & 84TH ST SE - NB
		allStops.put("4280", "422"); // E CASINO RD & 8TH AVE SE - EB
		allStops.put("4260", "423"); // E CASINO RD & XAVIER WAY - EB
		allStops.put("4245", "424"); // E CASINO RD & RAINIER DR - EB
		allStops.put("4240", "425"); // E CASINO RD & HIGHLAND DR - NB
		allStops.put("4235", "426"); // BEVERLY BLVD & 75TH ST SE - NB
		allStops.put("4143", "427"); // BEVERLY BLVD & 72ND ST SE - NB
		allStops.put("4120", "428"); // BEVERLY BLVD & MADISON - NB
		allStops.put("4110", "429"); // BEVERLY BLVD & PALM AVE - NB
		allStops.put("1500", "43"); // COLBY AVE & 34TH ST - SB
		allStops.put("4100", "430"); // BEVERLY BLVD & WETMORE AVE - NB
		allStops.put("4090", "431"); // COLBY AVE & 60TH ST SE - NB
		allStops.put("4075", "432"); // COLBY AVE & 55TH ST SE - NB
		allStops.put("3330", "433"); // COLBY AVE & 52ND ST SE - NB
		allStops.put("3305", "434"); // COLBY AVE & ALTA DR - NB
		allStops.put("3295", "435"); // COLBY AVE & 47TH ST SE - NB
		allStops.put("3260", "436"); // COLBY AVE & 43RD ST SE - NB
		allStops.put("1270", "437"); // COLBY AVE & 26TH ST - NB
		allStops.put("1250", "438"); // COLBY AVE & 24TH ST - NB
		allStops.put("1240", "439"); // COLBY AVE & 23RD ST - NB
		allStops.put("1510", "44"); // COLBY AVE & 36TH ST - SB
		allStops.put("1210", "440"); // COLBY AVE & 21ST ST - NB
		allStops.put("1200", "441"); // COLBY AVE & 19TH ST - NB
		allStops.put("1160", "442"); // COLBY AVE & 17TH ST - NB
		allStops.put("1155", "443"); // COLBY AVE & 15TH ST - NB
		allStops.put("1140", "444"); // COLBY AVE & 13TH ST - NB
		allStops.put("1093", "445"); // COLBY AVE & 10TH ST - NB
		allStops.put("1090", "446"); // WETMORE AVE & 8TH ST - NB
		allStops.put("1085", "447"); // WETMORE AVE & 6TH ST - NB
		allStops.put("1080", "448"); // ALVERSON BLVD & 4TH ST - NB
		allStops.put("1075", "449"); // ALVERSON BLVD & 2ND ST - NB
		allStops.put("1530", "45"); // COLBY AVE & 39TH ST - SB
		allStops.put("1010", "450"); // W MARINE VIEW DR & BRIDGE WAY - EB
		allStops.put("3070", "451"); // W MUKILTEO BLVD & OLYMPIC BLVD - WB
		allStops.put("3085", "452"); // W MUKILTEO BLVD & RIDGEMONT  DR - WB
		allStops.put("3100", "453"); // W MUKILTEO BLVD & SEAHURST AVE - WB
		allStops.put("3110", "454"); // W MUKILTEO BLVD & GLENWOOD AVE - WB
		allStops.put("3120", "455"); // W MUKILTEO BLVD & DOVER - WB
		allStops.put("3130", "456"); // W MUKILTEO BLVD & HARBOR LN - WB
		allStops.put("3135", "457"); // W MUKILTEO BLVD & KIRBY PL - WB
		allStops.put("3145", "458"); // W MUKILTEO BLVD & 23RD AVE W - WB
		allStops.put("3160", "459"); // W MUKILTEO BLVD & SEAVIEW WAY - WB
		allStops.put("1540", "46"); // 41ST & COLBY AVE - WB
		allStops.put("3165", "460"); // W MUKILTEO BLVD & GARDNER AVE - WB
		allStops.put("3175", "461"); // W MUKILTEO BLVD & 33RD AVE W - WB
		allStops.put("3190", "462"); // W MUKILTEO BLVD & SOUND AVE - WB
		allStops.put("3200", "463"); // W MUKILTEO BLVD & UPLAND AVE - WB
		allStops.put("3210", "464"); // W MUKILTEO BLVD & MUKILTEO LN - WB
		allStops.put("3220", "465"); // 5TH ST & PROSPECT AVE - WB
		allStops.put("3225", "466"); // 5TH ST & LOVELAND AVE - WB
		allStops.put("3245", "467"); // 5TH ST & LINCOLN AVE - WB
		allStops.put("3250", "468"); // SR 525 & FRONT ST - SB DROPOFF ONLY
		allStops.put("1465", "469"); // MUKILTEO FERRY TERMINAL
		allStops.put("1545", "47"); // 41ST ST & RUCKER AVE - WB
		allStops.put("1455", "470"); // SR 525 & 3RD ST - SB
		allStops.put("3240", "471"); // 5TH ST & LINCOLN AVE - EB
		allStops.put("3235", "472"); // 5TH ST & LOVELAND AVE - EB
		allStops.put("3215", "473"); // 5TH ST & PROSPECT AVE - EB
		allStops.put("3205", "474"); // W MUKILTEO BLVD & LAMAR DR - EB
		allStops.put("3195", "475"); // W MUKILTEO BLVD & UPLAND AVE - EB
		allStops.put("3185", "476"); // W MUKILTEO BLVD & SOUND AVE - EB
		allStops.put("3180", "477"); // W MUKILTEO BLVD & 33RD AVE W - EB
		allStops.put("3170", "478"); // W MUKILTEO BLVD & OCEAN AVE - EB
		allStops.put("3155", "479"); // W MUKILTEO BLVD & SEAVIEW WAY - EB
		allStops.put("3030", "48"); // E MUKILTEO BLVD & 42ND ST - WB
		allStops.put("3150", "480"); // W MUKILTEO BLVD & 23RD AVE W - EB
		allStops.put("3140", "481"); // W MUKILTEO BLVD & KIRBY PL - EB
		allStops.put("3125", "482"); // W MUKILTEO BLVD & HARBOR LN - EB
		allStops.put("3115", "483"); // W MUKILTEO BLVD & GREELY ST - EB
		allStops.put("3105", "484"); // W MUKILTEO BLVD & GLENWOOD AVE - EB
		allStops.put("3095", "485"); // W MUKILTEO BLVD & SEAHURST AVE - EB
		allStops.put("3090", "486"); // W MUKILTEO BLVD & GLENHAVEN DR - EB
		allStops.put("1054", "487"); // COLLEGE STATION - BAY D - NB
		allStops.put("2050", "488"); // RAINIER AVE & 12TH ST - NB
		allStops.put("2045", "489"); // RAINIER AVE & 11TH ST - NB
		allStops.put("3045", "49"); // E MUKILTEO BLVD & PIGEON CREEK RD - WB
		allStops.put("2030", "490"); // 11TH ST & POPLAR ST - EB
		allStops.put("2065", "491"); // POPLAR ST & 12TH ST - SB
		allStops.put("2100", "492"); // 15TH ST & FULTON ST - EB
		allStops.put("2105", "493"); // 15TH ST & MAPLE ST - EB
		allStops.put("2230", "494"); // WALNUT ST & 24TH ST - SB
		allStops.put("2285", "495"); // EVERETT AVE & WALNUT ST - WB
		allStops.put("2342", "496"); // SMITH AVE & 35TH ST - SB
		allStops.put("2345", "497"); // SMITH AVE & 36TH ST - SB
		allStops.put("4000", "498"); // S 3RD AVE & 42ND ST - SB
		allStops.put("4010", "499"); // S 3RD AVE & 43RD ST - SB
		allStops.put("6268", "5"); // 3RD AVE SE & SE EVERETT MALL WAY - SB
		allStops.put("3080", "50"); // DOGWOOD DR & W MUKILTEO BLVD - SB
		allStops.put("4020", "500"); // S 3RD AVE & 45TH ST - SB
		allStops.put("4030", "501"); // S 2ND AVE & 49TH ST - SB
		allStops.put("4045", "502"); // S 2ND AVE & EUGENE ST - SB
		allStops.put("4050", "503"); // S 2ND AVE & MAIN ST - SB
		allStops.put("4177", "504"); // BROADWAY & MADISON ST - SB
		allStops.put("4169", "505"); // BROADWAY & MONROE AVE - SB
		allStops.put("4161", "506"); // BROADWAY & 74TH ST SE - SB
		allStops.put("4232", "507"); // BROADWAY & 79TH ST SE - SB
		allStops.put("4248", "508"); // BEVERLY BLVD & BROADWAY - SB
		allStops.put("6125", "509"); // 19TH AVE SE & BURLEY DR - SB
		allStops.put("3340", "51"); // DOGWOOD DR & 48TH ST SW - SB
		allStops.put("6130", "510"); // 19TH AVE SE & 96TH PL SE - SB
		allStops.put("6135", "511"); // 19TH AVE SE & 98TH ST SE - SB
		allStops.put("6377", "512"); // 19TH AVE SE & 101ST ST SE - SB
		allStops.put("6140", "513"); // 19TH AVE SE & 102ND ST SE - SB
		allStops.put("6145", "514"); // 19TH AVE SE & 106TH PL SE - SB
		allStops.put("6150", "515"); // 19TH AVE SE & 110TH ST SE - SB
		allStops.put("6402", "516"); // 19TH AVE SE & 113TH ST SE - EB
		allStops.put("6247", "517"); // 19TH AVE SE & 116TH ST SE - SB
		allStops.put("6430", "518"); // 121ST ST SE & 19TH AVE SE - WB
		allStops.put("6355", "519"); // 121ST ST SE & SILVER LAKE DR  - WB
		allStops.put("3345", "52"); // DOGWOOD DR & ALDER ST - SB
		allStops.put("6350", "520"); // 121ST ST SE & SILVER LAKE RD - WB
		allStops.put("6200", "521"); // SILVER LAKE RD & 116TH ST SE - NB
		allStops.put("6343", "522"); // SILVER LAKE RD & SILVER LAKE BEACH - NB
		allStops.put("6160", "523"); // 112TH ST SE & SILVER LAKE RD - WB
		allStops.put("6331", "524"); // South Everett Freeway Station - Bay 1
		allStops.put("6165", "525"); // 112TH ST SE & 10TH AVE SE - WB
		allStops.put("6170", "526"); // 7TH AVE SE & 112TH ST SE - NB
		allStops.put("6175", "527"); // 7TH AVE SE & 109TH ST SE - NB
		allStops.put("6180", "528"); // 7TH AVE SE & 105TH ST SE - NB
		allStops.put("6185", "529"); // 7TH AVE SE & BRUSKRUD RD - NB
		allStops.put("3365", "53"); // BEVERLY LN & SUNSET LN - SB
		allStops.put("4159", "530"); // 75TH ST SE & MCDOUGALL AVE - EB
		allStops.put("4151", "531"); // RIDGEWOOD DR & TIMBER HILL DR - SB
		allStops.put("4157", "532"); // PANAVIEW BLVD & LARLIN DR - SB
		allStops.put("4154", "533"); // LARLIN DR & PANAVIEW BLVD - NB
		allStops.put("4156", "534"); // SUNRISE DR & PANAVIEW BLVD - NB
		allStops.put("4158", "535"); // 75TH ST SE & MCDOUGALL AVE - WB
		allStops.put("2502", "536"); // EASTMONT PARK & RIDE BAY 3 - WB
		allStops.put("6310", "537"); // 100TH ST SE & 100TH PL SE - WB
		allStops.put("6305", "538"); // 100TH ST SE & 7TH AVE SE - WB
		allStops.put("6315", "539"); // 7TH AVE SE & 103RD PL SE - SB
		allStops.put("3375", "54"); // BEVERLY LN & HIGHLAND RD - SB
		allStops.put("6320", "540"); // 7TH AVE SE & 105TH PL SE - SB
		allStops.put("6325", "541"); // 7TH AVE SE & 110TH ST SE - SB
		allStops.put("6330", "542"); // 112TH ST SE & 9TH AVE SE - EB
		allStops.put("6332", "543"); // South Everett Freeway Station - Bay 4
		allStops.put("6335", "544"); // 112TH ST SE & SILVER LAKE RD - EB
		allStops.put("6340", "545"); // SILVER LAKE RD & SILVER LAKE BEACH - SB
		allStops.put("6345", "546"); // SILVER LAKE RD & 116TH ST SE - SB
		allStops.put("6205", "547"); // SILVER LAKE RD & 119TH PL SE - SB
		allStops.put("6210", "548"); // SILVER LAKE RD & 13TH DR SE - EB
		allStops.put("6215", "549"); // 121ST ST SE & 17TH AVE SE - EB
		allStops.put("3500", "55"); // BEVERLY LN & PECKS - SB
		allStops.put("6220", "550"); // 121ST ST SE & 19TH AVE SE - EB
		allStops.put("6425", "551"); // 19TH AVE SE & 121ST ST SE - NB
		allStops.put("6420", "552"); // 19TH AVE SE & LAKE HEIGHTS DR - NB
		allStops.put("6410", "553"); // 19TH AVE SE & 116TH ST SE - NB
		allStops.put("6405", "554"); // 19TH AVE SE & 113TH ST SE - WB
		allStops.put("6365", "555"); // 19TH AVE SE & 110TH ST SE - NB
		allStops.put("6370", "556"); // 19TH AVE SE & 105TH ST SE - NB
		allStops.put("6375", "557"); // 19TH AVE SE & 102ND ST SE - NB
		allStops.put("6380", "558"); // 19TH AVE SE & 100TH ST SE - NB
		allStops.put("6388", "559"); // 19TH AVE SE & 96TH PL SE - NB
		allStops.put("3545", "56"); // BEVERLY LN & E BEECH ST - SB
		allStops.put("6390", "560"); // 19TH AVE SE & BURLEY DR - NB
		allStops.put("4249", "561"); // BROADWAY & BEVERLY BLVD - NB
		allStops.put("4231", "562"); // BROADWAY & 79TH ST SE - NB
		allStops.put("4162", "563"); // BROADWAY & 75TH ST SE - NB
		allStops.put("4164", "564"); // BROADWAY & 73RD ST SE - NB
		allStops.put("4168", "565"); // BROADWAY & ADAMS AVE - NB
		allStops.put("4065", "566"); // LOWELL RD & S 3RD AVE - EB
		allStops.put("4060", "567"); // S 2ND AVE & ZILLAH ST - NB
		allStops.put("4040", "568"); // S 2ND AVE & EUGENE ST - NB
		allStops.put("4035", "569"); // S 2ND AVE & 49TH ST - NB
		allStops.put("3550", "57"); // BEVERLY LN & MADISON ST - SB
		allStops.put("4025", "570"); // S 3RD AVE & 46TH ST - NB
		allStops.put("4015", "571"); // S 3RD AVE & 44TH ST - NB
		allStops.put("4005", "572"); // S 3RD AVE & 42ND ST - NB
		allStops.put("2343", "573"); // SMITH AVE & 36TH ST - NB
		allStops.put("2280", "574"); // EVERETT AVE & CEDAR - EB
		allStops.put("2235", "575"); // WALNUT ST & 26TH ST - NB
		allStops.put("2225", "576"); // WALNUT ST & 24TH ST - NB
		allStops.put("2110", "577"); // 15TH ST & WALNUT ST - WB
		allStops.put("2095", "578"); // 15TH ST & BAKER AVE - WB
		allStops.put("2090", "579"); // POPLAR ST & 14TH ST - NB
		allStops.put("3565", "58"); // BEVERLY LN & S CABOT RD - SB
		allStops.put("2060", "580"); // POPLAR ST & 12TH ST - NB
		allStops.put("2035", "581"); // 11TH ST & POPLAR ST - WB
		allStops.put("2040", "582"); // 11th St & RAINIER AVE - WB
		allStops.put("2055", "583"); // RAINIER AVE & 12TH ST - SB
		allStops.put("1472", "584"); // SR 525 & GOAT TRAIL RD - SB
		allStops.put("1470", "585"); // SR 525 & CLOVER LN - SB
		allStops.put("1468", "586"); // SR 525 & 76TH ST SW - SB
		allStops.put("1469", "587"); // SR 525 & 80TH ST SW - SB
		allStops.put("1456", "588"); // SR 525 & 81ST PL SW - SB
		allStops.put("7380", "589"); // 84TH ST SW & 44TH AVE W - EB
		allStops.put("3567", "59"); // BEVERLY LN & 72ND ST SE - SB
		allStops.put("2484", "590"); // AIRPORT RD & W CASINO RD - SB
		allStops.put("7375", "591"); // 84TH ST SW & 44TH AVE W - WB
		allStops.put("964", "592"); // SR 525 & 84TH ST SW - NB
		allStops.put("963", "593"); // SR 525 & 80TH ST SW - NB
		allStops.put("973", "594"); // SR 525 & 76TH ST SW - NB
		allStops.put("967", "595"); // SR 525 & CLOVER LANE - NB
		allStops.put("972", "596"); // SR 525 & 15TH PL - NB
		allStops.put("968", "597"); // SR 525 & GOAT TRAIL RD - NB
		allStops.put("6272", "6"); // 3RD AVE SE & 102ND ST SE - SB
		allStops.put("3580", "60"); // BEVERLY LN & 75TH ST SE - SB
		allStops.put("3585", "61"); // BEVERLY LN & 77TH ST SE - SB
		allStops.put("3595", "62"); // 79TH PL SE & BEVERLY LN - EB
		allStops.put("1367", "63"); // EVERGREEN WAY & 79TH PL SE - SB
		allStops.put("5120", "64"); // E CASINO RD & EVERGREEN WAY - WB
		allStops.put("5110", "65"); // E CASINO RD & MERIDIAN AVE - WB
		allStops.put("5105", "66"); // W CASINO RD & 2ND AVE W - WB
		allStops.put("5095", "67"); // W CASINO RD & UPPER RIDGE RD - WB
		allStops.put("5085", "68"); // W CASINO RD & 5TH AVE W - WB
		allStops.put("5080", "69"); // W CASINO RD & 8TH AVE W - WB
		allStops.put("6278", "7"); // 3RD AVE SE & 109TH PL SE - SB
		allStops.put("5070", "70"); // W CASINO RD & 10TH AVE W - WB
		allStops.put("5060", "71"); // W CASINO RD & HALL PARK RD - WB
		allStops.put("5050", "72"); // W CASINO RD & SOMERSET DR - WB
		allStops.put("5035", "73"); // W CASINO RD & 18TH AVE W - WB
		allStops.put("5025", "74"); // W CASINO RD & 84TH ST SW - WB
		allStops.put("5015", "75"); // W CASINO RD & 23RD AVE W - WB
		allStops.put("5000", "76"); // W CASINO RD & AIRPORT RD - WB
		allStops.put("2327", "77"); // BOEING GATE E-72
		allStops.put("5005", "78"); // W CASINO RD & AIRPORT RD - EB
		allStops.put("2328", "79"); // BOEING GATE E-84
		allStops.put("6296", "8"); // 112TH ST SE & 2ND AVE SE - WB
		allStops.put("2330", "80"); // BOEING GATE E-88
		allStops.put("2905", "81"); // PERIMETER RD & SEAWAY BLVD - EB
		allStops.put("2913", "82"); // AIRPORT RD & KASCH PARK RD - SB
		allStops.put("2668", "83"); // AIRPORT RD & 94TH ST SW - SB
		allStops.put("1741", "84"); // 94TH ST SW & AIRPORT RD - WB
		allStops.put("1748", "85"); // BOEING GATE E-67
		allStops.put("2977", "86"); // BOEING GATE E-68
		allStops.put("5020", "87"); // W CASINO RD & 23RD AVE W - EB
		allStops.put("5030", "88"); // W CASINO RD & 84TH ST SW - EB
		allStops.put("5040", "89"); // W CASINO RD & 18TH AVE W - EB
		allStops.put("6292", "9"); // 112TH ST SE & MERIDIAN PL W - WB
		allStops.put("5045", "90"); // W CASINO RD & SOMERSET DR - EB
		allStops.put("5055", "91"); // W CASINO RD & HALL PARK RD - EB
		allStops.put("5065", "92"); // W CASINO RD & 10TH AVE W - EB
		allStops.put("5075", "93"); // W CASINO RD & 8TH AVE W - EB
		allStops.put("5087", "94"); // W CASINO RD & 5TH AVE W - EB
		allStops.put("5090", "95"); // W CASINO RD & UPPER RIDGE RD - EB
		allStops.put("5100", "96"); // W CASINO RD & 2ND AVE W - EB
		allStops.put("5115", "97"); // E CASINO RD & EVERGREEN WAY - EB
		allStops.put("3600", "98"); // 79TH PL SE & EVERGREEN WAY - WB
		allStops.put("3590", "99"); // BEVERLY LN & 78TH ST SE - NB
		ALL_STOPS = allStops;
	}
}

