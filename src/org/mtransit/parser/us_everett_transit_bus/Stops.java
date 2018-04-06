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
		allStops.put("1053", "126"); // COLLEGE STATION - BAY C - SB
		allStops.put("2010", "127"); // N BROADWAY & 7TH ST - NB
		allStops.put("2000", "128"); // E MARINE VIEW DR & BELMONTE LN - SB
		allStops.put("2015", "129"); // E MARINE VIEW DR & HAWTHORNE ST - SB
		allStops.put("5212", "13"); // 112TH ST SW & 16TH AVE W - WB
		allStops.put("2017", "130"); // E MARINE VIEW DR & 10TH ST  - SB
		allStops.put("2070", "131"); // E MARINE VIEW DR & 12TH ST - SB
		allStops.put("2115", "132"); // WALNUT ST & 15TH ST - SB
		allStops.put("2130", "133"); // WALNUT ST & 17TH ST - SB
		allStops.put("2150", "134"); // WALNUT ST & 19TH ST - SB
		allStops.put("2155", "135"); // WALNUT ST & LEONARD DR - SB
		allStops.put("2165", "136"); // WALNUT ST & 22ND ST - SB
		allStops.put("2180", "137"); // 23RD ST & STATE ST- EB
		allStops.put("2195", "138"); // 23RD ST & SUMMIT AVE - EB
		allStops.put("2210", "139"); // HARRISON AVE & 25TH ST - SB
		allStops.put("5216", "14"); // 112TH ST SW & PAINE FIELD WAY - WB
		allStops.put("2305", "140"); // HARRISON AVE & EVERETT AVE - SB
		allStops.put("2300", "141"); // EVERETT AVE & SUMMIT AVE - WB
		allStops.put("2282", "142"); // MAPLE ST & EVERETT AVE - SB
		allStops.put("2315", "143"); // MAPLE ST & PACIFIC AVE - SB
		allStops.put("2331", "144"); // PACIFIC AVE & CEDAR ST - WB
		allStops.put("2340", "145"); // EVERETT STATION - F1 - SB
		allStops.put("2323", "146"); // 33RD ST & MCDOUGALL AVE - WB
		allStops.put("1457", "147"); // PACIFIC AVE & LOMBARD AVE - WB
		allStops.put("2356", "148"); // PACIFIC AVE & ROCKEFELLER AVE - WB
		allStops.put("1383", "149"); // WALL ST & HOYT AVE - WB
		allStops.put("5265", "15"); // AIRPORT RD & 112TH ST SW - SB
		allStops.put("1373", "150"); // WALL ST & GRAND AVE - WB
		allStops.put("1390", "151"); // PACIFIC AVE & NASSAU ST - WB
		allStops.put("1378", "152"); // WALL ST & GRAND AVE - EB
		allStops.put("1388", "153"); // WALL ST & COLBY AVE - EB
		allStops.put("2359", "154"); // PACIFIC AVE & ROCKEFELLER AVE - EB
		allStops.put("1450", "155"); // LOMBARD AVE & PACIFIC AVE - NB
		allStops.put("2886", "156"); // BROADWAY & WALL ST - SB
		allStops.put("2324", "157"); // 33RD ST & MCDOUGALL AVE - EB
		allStops.put("2445", "158"); // EVERETT STATION - E1
		allStops.put("2335", "159"); // PACIFIC AVE & CEDAR ST - EB
		allStops.put("1301", "16"); // AIRPORT RD & EVERGREEN WAY - EB
		allStops.put("2310", "160"); // MAPLE ST & HEWITT AVE - NB
		allStops.put("2290", "161"); // EVERETT AVE & WALNUT ST - EB
		allStops.put("2295", "162"); // EVERETT AVE & HIGHLAND AVE - EB
		allStops.put("2215", "163"); // HARRISON AVE & 26TH ST - NB
		allStops.put("2205", "164"); // HARRISON AVE & 24TH ST - NB
		allStops.put("2190", "165"); // 23RD ST & SUMMIT AVE - WB
		allStops.put("2185", "166"); // 23RD ST & STATE ST - WB
		allStops.put("2160", "167"); // WALNUT ST & 22ND ST - NB
		allStops.put("2145", "168"); // WALNUT ST & 19TH ST - NB
		allStops.put("2125", "169"); // WALNUT ST & 17TH ST - NB
		allStops.put("1299", "17"); // AIRPORT RD & ADMIRALTY WAY - EB
		allStops.put("2120", "170"); // WALNUT ST & 15TH ST - NB
		allStops.put("2075", "171"); // E MARINE VIEW DR & 13TH ST - NB
		allStops.put("2025", "172"); // E MARINE VIEW DR & 10TH ST - NB
		allStops.put("2005", "173"); // E MARINE VIEW DR & BUTLER ST - NB
		allStops.put("2001", "174"); // E MARINE VIEW DR & BELMONTE LN - NB
		allStops.put("1035", "175"); // N BROADWAY & 8TH ST - SB
		allStops.put("1328", "176"); // N BROADWAY & TOWER ST - SB
		allStops.put("2441", "177"); // EVERETT STATION - D4
		allStops.put("2887", "178"); // BROADWAY & PACIFIC AVENUE - NB
		allStops.put("2440", "179"); // HEWITT AVE & LOMBARD AVE - WB
		allStops.put("168", "18"); // AIRPORT RD & E GIBSON RD - EB
		allStops.put("1355", "180"); // HEWITT AVE & ROCKEFELLER AVE - WB
		allStops.put("1375", "181"); // HEWITT AVE & WETMORE AVE - WB
		allStops.put("1380", "182"); // HEWITT AVE & HOYT AVE - WB
		allStops.put("1358", "183"); // HEWITT AVE & GRAND AVE - WB
		allStops.put("1268", "184"); // W MARINE VIEW DR & CALIFORNIA ST - NB
		allStops.put("1260", "185"); // W MARINE VIEW DR & 26TH ST - NB
		allStops.put("1225", "186"); // W MARINE VIEW DR & 18TH ST - NB
		allStops.put("1120", "187"); // 13TH ST & W MARINE VIEW DR - WB
		allStops.put("1123", "188"); // W MARINE VIEW DR & 14TH ST - SB
		allStops.put("1125", "189"); // W MARINE VIEW DR & 16TH ST - SB
		allStops.put("167", "19"); // 128TH ST SW & 8TH AVE W - EB
		allStops.put("1230", "190"); // W MARINE VIEW DR & 19TH ST - SB
		allStops.put("1265", "191"); // W MARINE VIEW DR & 26TH ST - SB
		allStops.put("1263", "192"); // W MARINE VIEW DR & CALIFORNIA ST - SB
		allStops.put("1357", "193"); // HEWITT AVE & GRAND AVE - EB
		allStops.put("1385", "194"); // HEWITT AVE & HOYT AVE - EB
		allStops.put("1365", "195"); // HEWITT AVE & WETMORE - EB
		allStops.put("426", "196"); // HEWITT AVE & OAKES AVE - EB
		allStops.put("1056", "197"); // COLLEGE STATION - BAY F - NB
		allStops.put("1060", "198"); // N BROADWAY & 10TH ST - SB
		allStops.put("1170", "199"); // BROADWAY & 12TH ST - SB
		allStops.put("6105", "2"); // SE EVERETT MALL WAY & W MALL DR - WB
		allStops.put("2106", "20"); // MARINER PARK AND RIDE - Bay 4
		allStops.put("1318", "200"); // BROADWAY & 14TH ST - SB
		allStops.put("1180", "201"); // BROADWAY & 16TH ST - SB
		allStops.put("1185", "202"); // BROADWAY & 18TH ST - SB
		allStops.put("1190", "203"); // BROADWAY & 19TH ST - SB
		allStops.put("1195", "204"); // BROADWAY & 21ST ST - SB
		allStops.put("1235", "205"); // BROADWAY & 23RD ST - SB
		allStops.put("1315", "206"); // BROADWAY & 25TH ST - SB
		allStops.put("9973", "207"); // BROADWAY & CALIFORNIA - SB
		allStops.put("1410", "208"); // RUCKER AVE & PACIFIC AVE - SB
		allStops.put("1477", "209"); // RUCKER AVE & 33RD ST - SB
		allStops.put("6288", "21"); // 4TH AVE W & 124TH ST SW - NB
		allStops.put("1480", "210"); // RUCKER AVE & 35TH ST - SB
		allStops.put("1525", "211"); // RUCKER AVE & 37TH ST - SB
		allStops.put("1535", "212"); // RUCKER AVE & 39TH ST - SB
		allStops.put("3010", "213"); // RUCKER AVE & 41ST ST - SB
		allStops.put("3270", "214"); // EVERGREEN WAY & 44TH ST SE - SB
		allStops.put("3285", "215"); // EVERGREEN WAY & 47TH ST SE - SB
		allStops.put("3320", "216"); // EVERGREEN WAY & 50TH ST SE - SB
		allStops.put("3650", "217"); // EVERGREEN WAY & 52ND ST SE - SB
		allStops.put("3645", "218"); // EVERGREEN WAY & 57TH ST SE - SB
		allStops.put("3640", "219"); // EVERGREEN WAY & 59TH ST SE - SB
		allStops.put("6284", "22"); // 4TH AVE W & 120TH ST SW - NB
		allStops.put("3635", "220"); // EVERGREEN WAY & PECKS DR - SB
		allStops.put("3630", "221"); // EVERGREEN WAY & 6500 BLK - SB
		allStops.put("3625", "222"); // EVERGREEN WAY & MADISON ST - SB
		allStops.put("3620", "223"); // EVERGREEN WAY & 73RD - SB
		allStops.put("3615", "224"); // EVERGREEN WAY & 75TH ST SE - SB
		allStops.put("3610", "225"); // EVERGREEN WAY & BRUIN BLVD - SB
		allStops.put("5125", "226"); // EVERGREEN WAY & E CASINO RD - SB
		allStops.put("5136", "227"); // EVERGREEN WAY & 86TH - SB
		allStops.put("5150", "228"); // EVERGREEN WAY & HOLLY DR - SB
		allStops.put("5160", "229"); // EVERGREEN WAY & 92ND ST SW - SB
		allStops.put("6282", "23"); // 4TH AVE W & 116TH PL SW - NB
		allStops.put("5175", "230"); // EVERGREEN WAY & W INTERCITY AVE - SB
		allStops.put("5185", "231"); // EVERGREEN WAY & 4TH AVE W - SB
		allStops.put("5190", "232"); // EVERGREEN WAY & 100TH ST SW - SB
		allStops.put("6245", "233"); // SW EVERETT MALL WAY & 4TH AVE W - EB
		allStops.put("6238", "234"); // SE EVERETT MALL WAY & MERIDIAN AVE - EB
		allStops.put("6395", "235"); // MALL STATION - BAY 1
		allStops.put("6230", "236"); // SE EVERETT MALL WAY & 3RD AVE SE - WB
		allStops.put("6235", "237"); // SE EVERETT MALL WAY & 1ST DR - WB
		allStops.put("6240", "238"); // SW EVERETT MALL WAY & 1ST PL W - WB
		allStops.put("6244", "239"); // SW EVERETT MALL WAY & 4TH AVE W - WB
		allStops.put("6291", "24"); // 112TH ST SW & 4TH AVE W - EB
		allStops.put("6265", "240"); // EVERGREEN WAY & SW EVERETT MALL WAY - NB
		allStops.put("6270", "241"); // EVERGREEN WAY & 100TH ST SW - NB
		allStops.put("6277", "242"); // EVERGREEN WAY & 4TH AVE W - NB
		allStops.put("5180", "243"); // EVERGREEN WAY & W MARILYN AVE - NB
		allStops.put("5170", "244"); // EVERGREEN WAY & W INTERCITY AVE - NB
		allStops.put("5155", "245"); // EVERGREEN WAY & 92ND ST SW - NB
		allStops.put("5145", "246"); // EVERGREEN WAY & HOLLY DR - NB
		allStops.put("5135", "247"); // EVERGREEN WAY & 86TH - NB
		allStops.put("5130", "248"); // EVERGREEN WAY & CASINO RD - NB
		allStops.put("877", "249"); // EVERGREEN WAY & 79TH PL SE - NB
		allStops.put("6293", "25"); // 112TH ST SE & 1ST AVE SE - EB
		allStops.put("3605", "250"); // EVERGREEN WAY & BRUIN BLVD - NB
		allStops.put("3168", "251"); // EVERGREEN WAY & 75TH ST SE - NB
		allStops.put("3622", "252"); // EVERGREEN WAY & 71ST - NB
		allStops.put("3628", "253"); // EVERGREEN WAY & MADISON ST - NB
		allStops.put("3638", "254"); // EVERGREEN WAY & BERKSHIRE DR - NB
		allStops.put("3642", "255"); // EVERGREEN WAY & 57TH ST SE - NB
		allStops.put("3647", "256"); // EVERGREEN WAY & HIGHWAY PL - NB
		allStops.put("3325", "257"); // EVERGREEN WAY & 52ND ST SE - NB
		allStops.put("3315", "258"); // EVERGREEN WAY & 50TH ST SE - NB
		allStops.put("3290", "259"); // EVERGREEN WAY & WILMINGTON AVE - NB
		allStops.put("6279", "26"); // 3RD AVE SE & 112TH ST SW - NB
		allStops.put("3255", "260"); // RUCKER AVE & 43RD ST SE - NB
		allStops.put("1537", "261"); // RUCKER AVE & 39TH ST - NB
		allStops.put("1520", "262"); // RUCKER AVE & 37TH ST - NB
		allStops.put("1475", "263"); // RUCKER AVE & 35TH ST - NB
		allStops.put("1466", "264"); // RUCKER AVE & 33RD ST - NB
		allStops.put("1460", "265"); // RUCKER AVE & 32ND ST - NB
		allStops.put("9967", "266"); // BROADWAY & CALIFORNIA - NB
		allStops.put("2240", "267"); // BROADWAY & 26TH ST - NB
		allStops.put("2175", "268"); // BROADWAY & 23RD ST - NB
		allStops.put("2170", "269"); // BROADWAY & 21ST ST - NB
		allStops.put("6275", "27"); // 3RD AVE SE & 106TH ST SE - NB
		allStops.put("2140", "270"); // BROADWAY & 19TH ST - NB
		allStops.put("2135", "271"); // BROADWAY & 18TH ST - NB
		allStops.put("2085", "272"); // BROADWAY & 15TH ST - NB
		allStops.put("827", "273"); // BROADWAY & 13TH ST - NB
		allStops.put("2367", "274"); // BROADWAY & 34TH ST - SB
		allStops.put("1553", "275"); // BROADWAY & 36TH ST - SB
		allStops.put("2366", "276"); // BROADWAY & 38TH ST - SB
		allStops.put("4008", "277"); // BROADWAY & 45TH ST SE - SB
		allStops.put("4220", "278"); // BROADWAY & 53RD ST SE - SB
		allStops.put("4210", "279"); // BROADWAY & 56TH ST SE - SB
		allStops.put("6273", "28"); // 3RD AVE SE & 102ND ST SE - NB
		allStops.put("4200", "280"); // BROADWAY & 60TH ST SE - SB
		allStops.put("4190", "281"); // BROADWAY & 62ND ST SE - SB
		allStops.put("4180", "282"); // BROADWAY & MELVIN AVE - SB
		allStops.put("4175", "283"); // MADISON ST & JEFFERSON AVE - WB
		allStops.put("4165", "284"); // MADISON ST & COMMERCIAL AVE - WB
		allStops.put("4135", "285"); // MADISON ST & BEVERLY BLVD - WB
		allStops.put("4140", "286"); // MADISON ST & HIGHLAND DR - WB
		allStops.put("4148", "287"); // MADISON ST & BERKSHIRE DR - WB
		allStops.put("3536", "288"); // MADISON ST & CADY RD - WB
		allStops.put("3538", "289"); // MADISON ST & BEVERLY LN - WB
		allStops.put("6225", "29"); // SE EVERETT MALL WAY & 3RD AVE SE - EB
		allStops.put("3490", "290"); // BROOKRIDGE BLVD & 1ST PL SE - WB
		allStops.put("3380", "291"); // BROOKRIDGE BLVD & 1ST AVE SE - WB
		allStops.put("3390", "292"); // BROOKRIDGE BLVD & 1ST DR W - WB
		allStops.put("3400", "293"); // BROOKRIDGE BLVD & 4TH DR W - WB
		allStops.put("3415", "294"); // MERRILL CREEK PKWY & GLENWOOD AVE - WB
		allStops.put("3425", "295"); // MERRILL CREEK PKWY & 13TH AVE W - WB
		allStops.put("3440", "296"); // HARDESON RD & MERRILL CREEK PKWY - SB
		allStops.put("3660", "297"); // HARDESON RD & 64TH ST SW - SB
		allStops.put("3665", "298"); // HARDESON RD & 70TH ST SW - SB
		allStops.put("3668", "299"); // HARDESON RD & SHUKSAN WAY - SB
		allStops.put("6095", "3"); // SE EVERETT MALL WAY & 10TH AVE SE - WB
		allStops.put("6090", "30"); // SE EVERETT MALL WAY & 7TH AVE SE - EB
		allStops.put("3670", "300"); // HARDESON RD & 72ND ST SW - SB
		allStops.put("3675", "301"); // HARDESON RD & 75TH ST SW - SB
		allStops.put("3676", "302"); // 75TH ST SW & 16TH AVE W - WB
		allStops.put("3680", "303"); // 75TH ST SW & SEAWAY BLVD - WB
		allStops.put("3485", "304"); // SEAWAY BLVD & FLUKE DR - NB
		allStops.put("3480", "305"); // SEAWAY BLVD & 24TH AVE W - WB
		allStops.put("3475", "306"); // MERRILL CREEK PKWY & SEAWAY BLVD - NB
		allStops.put("3455", "307"); // MERRILL CREEK PKWY & 64TH ST - EB
		allStops.put("3450", "308"); // MERRILL CREEK PKWY & 23RD DR W - EB
		allStops.put("3445", "309"); // MERRILL CREEK PKWY & 20TH AVE W - EB
		allStops.put("6100", "31"); // SE EVERETT MALL WAY & 11TH AVE SE - EB
		allStops.put("3710", "310"); // HARDESON RD & 77TH - SB
		allStops.put("3715", "311"); // HARDESON RD & 80TH ST SW - SB
		allStops.put("5195", "312"); // EVERGREEN WAY & OLIVIA PARK RD - SB
		allStops.put("5200", "313"); // EVERGREEN WAY & 108TH ST SW - SB
		allStops.put("5205", "314"); // EVERGREEN WAY & 110TH ST SE - SB
		allStops.put("5210", "315"); // EVERGREEN WAY & 112TH ST SW - SB
		allStops.put("5310", "316"); // EVERGREEN WAY & 116TH - SB
		allStops.put("5288", "317"); // AIRPORT RD & EVERGREEN WAY - NB
		allStops.put("5217", "318"); // 112TH ST SW & AIRPORT RD - EB
		allStops.put("5213", "319"); // 112TH ST SW & 17TH CT SW - EB
		allStops.put("6397", "32"); // 100TH ST & WEST MALL DR - EB - DROP OFF ONLY
		allStops.put("5300", "320"); // EVERGREEN CENTER & 112TH ST SW - NB
		allStops.put("6295", "321"); // EVERGREEN WAY & 112TH ST SW - NB
		allStops.put("3720", "322"); // HARDESON RD & UPPER RIDGE RD - NB
		allStops.put("3705", "323"); // HARDESON RD & 77TH - NB
		allStops.put("3484", "324"); // HARDESON RD & VERALENE WAY - NB
		allStops.put("3673", "325"); // HARDESON RD & 75TH ST SW - NB
		allStops.put("3667", "326"); // HARDESON RD & SHUKSAN WAY- NB
		allStops.put("3479", "327"); // HARDESON RD & SHUKSAN WAY - NB
		allStops.put("3664", "328"); // HARDESON RD & 65TH ST SW - NB
		allStops.put("3663", "329"); // HARDESON RD & MERRILL CREEK PKWY - NB
		allStops.put("2430", "33"); // EVERETT STATION - D2
		allStops.put("3442", "330"); // MERRILL CREEK PKWY & HARDESON RD - WB
		allStops.put("3443", "331"); // MERRILL CREEK PKWY & 20TH AVE W - WB
		allStops.put("3447", "332"); // MERRILL CREEK PKWY & 23RD DR W - WB
		allStops.put("3446", "333"); // MERRILL CREEK PKWY & 64TH ST - WB
		allStops.put("3457", "334"); // MERRILL CREEK PKWY & SEAWAY BLVD - SB
		allStops.put("3483", "335"); // SEAWAY BLVD & MERRILL CREEK PKWY - SB
		allStops.put("3486", "336"); // SEAWAY BLVD & FLUKE DR - SB
		allStops.put("3473", "337"); // 75TH ST SW & SEAWAY BLVD - EB
		allStops.put("3677", "338"); // 75TH ST SW & 16TH AVE W - EB
		allStops.put("3430", "339"); // MERRILL CREEK PKWY & HARDESON RD - EB
		allStops.put("3006", "34"); // CEDAR ST & HEWITT  - NB
		allStops.put("3420", "340"); // MERRILL CREEK PKWY & 13TH AVE W - EB
		allStops.put("3410", "341"); // MERRILL CREEK PKWY & GLENWOOD AVE - EB
		allStops.put("3405", "342"); // BROOKRIDGE BLVD & SEAHURST AVE - EB
		allStops.put("3395", "343"); // BROOKRIDGE BLVD & 3RD DR W - EB
		allStops.put("3385", "344"); // BROOKRIDGE BLVD & 60TH PL SE - EB
		allStops.put("3383", "345"); // BROOKRIDGE BLVD & 59TH PL SE - EB
		allStops.put("3495", "346"); // BROOKRIDGE BLVD & 1ST DR SE - EB
		allStops.put("3537", "347"); // MADISON ST & MORGAN RD - EB
		allStops.put("4150", "348"); // MADISON ST & RAINIER DR - EB
		allStops.put("4145", "349"); // MADISON ST & OLYMPIC DR - EB
		allStops.put("2275", "35"); // EVERETT AVE & CEDAR ST - WB
		allStops.put("4125", "350"); // MADISON ST & BEVERLY BLVD - EB
		allStops.put("4160", "351"); // MADISON ST & COMMERCIAL AVE - EB
		allStops.put("4170", "352"); // MADISON ST & JEFFERSON AVE - EB
		allStops.put("4185", "353"); // BROADWAY & HOWARD AVE - NB
		allStops.put("4195", "354"); // BROADWAY & 62ND ST SE - NB
		allStops.put("4205", "355"); // BROADWAY & 60TH ST SE - NB
		allStops.put("4215", "356"); // BROADWAY & 56TH ST SE - SB
		allStops.put("4223", "357"); // BROADWAY & 52ND ST SE - NB
		allStops.put("4007", "358"); // BROADWAY & 45TH ST SE - NB
		allStops.put("2364", "359"); // BROADWAY & 38TH ST - NB
		allStops.put("2260", "36"); // EVERETT AVE & RAINIER AVE - WB
		allStops.put("1552", "360"); // BROADWAY & 36TH ST - NB
		allStops.put("2365", "361"); // BROADWAY & 34th ST - NB
		allStops.put("5215", "362"); // 100TH ST SW & EVERGREEN WAY - WB
		allStops.put("5220", "363"); // 100TH ST SW & HOLLY DR - WB
		allStops.put("5225", "364"); // 100TH ST SW & 12TH AVE W - WB
		allStops.put("5230", "365"); // 100TH ST SW & 15TH AVE W - WB
		allStops.put("5235", "366"); // 100TH ST SW & 18TH AVE W - WB
		allStops.put("5240", "367"); // 100TH ST SW & 23RD AVE W - WB
		allStops.put("5245", "368"); // 100TH ST SW & AIRPORT RD - WB
		allStops.put("5011", "369"); // AIRPORT RD & 94TH ST SW - NB
		allStops.put("1310", "37"); // EVERETT AVE & LOMBARD AVE - WB
		allStops.put("5007", "370"); // AIRPORT RD & KASCH PARK RD - NB
		allStops.put("5132", "371"); // E CASINO RD & EVERGREEN WAY - EB
		allStops.put("6000", "372"); // 7TH AVE SE & 84TH ST SE - SB
		allStops.put("6035", "373"); // 7TH AVE SE & 87TH ST SE - SB
		allStops.put("6045", "374"); // 7TH AVE SE & 90TH PL SE - SB
		allStops.put("6060", "375"); // 7TH AVE SE & 92ND ST SE - SB
		allStops.put("6070", "376"); // 7TH AVE SE & 94TH ST SE - SB
		allStops.put("6075", "377"); // 7TH AVE SE & SE EVERETT MALL WAY - SB
		allStops.put("1052", "378"); // COLLEGE STATION - BAY B - SB
		allStops.put("1011", "379"); // W MARINE VIEW DR & BRIDGE WAY - WB
		allStops.put("1290", "38"); // WETMORE AVE & EVERETT AVE - SB
		allStops.put("1076", "380"); // ALVERSON BLVD & 2ND ST - SB
		allStops.put("1082", "381"); // WETMORE AVE & ALVERSON BLVD  - SB
		allStops.put("1084", "382"); // WETMORE AVE & 6TH ST - SB
		allStops.put("1092", "383"); // WETMORE AVE & 8TH ST - SB
		allStops.put("1113", "384"); // COLBY AVE & 10TH ST - SB
		allStops.put("1145", "385"); // COLBY AVE & 13TH ST - SB
		allStops.put("1150", "386"); // COLBY AVE & 15TH ST - SB
		allStops.put("1165", "387"); // COLBY AVE & 17TH ST - SB
		allStops.put("1205", "388"); // COLBY AVE & 19TH ST - SB
		allStops.put("1215", "389"); // COLBY AVE & 21ST ST - SB
		allStops.put("1370", "39"); // WETMORE AVE & HEWITT AVE - SB
		allStops.put("1245", "390"); // COLBY AVE & 23RD ST - SB
		allStops.put("1255", "391"); // COLBY AVE & 25TH ST - SB
		allStops.put("1275", "392"); // COLBY AVE & 26TH ST - SB
		allStops.put("3000", "393"); // COLBY AVE & 41ST ST - SB
		allStops.put("3265", "394"); // COLBY AVE & 43RD ST SE - SB
		allStops.put("3275", "395"); // COLBY AVE & 45TH ST SE - SB
		allStops.put("3300", "396"); // COLBY AVE & 47TH ST SE - SB
		allStops.put("3310", "397"); // COLBY AVE & 50TH ST SE - SB
		allStops.put("4070", "398"); // COLBY AVE & 52ND ST SE - SB
		allStops.put("4085", "399"); // COLBY AVE & FAIRFAX AVE - SB
		allStops.put("6080", "4"); // SE EVERETT MALL WAY & 7TH AVE SE - WB
		allStops.put("2355", "40"); // WETMORE AVE & WALL ST - SB
		allStops.put("4095", "400"); // COLBY AVE & 60TH ST SE - SB
		allStops.put("4105", "401"); // BEVERLY BLVD & 63RD ST SE - SB
		allStops.put("4115", "402"); // BEVERLY BLVD & PALM AVE - SB
		allStops.put("4130", "403"); // BEVERLY BLVD & MADISON - SB
		allStops.put("4155", "404"); // BEVERLY BLVD & 72ND ST SE - SB
		allStops.put("4230", "405"); // BEVERLY BLVD & 75TH ST SE - SB
		allStops.put("4239", "406"); // E CASINO RD & HIGHLAND DR - SB
		allStops.put("4250", "407"); // E  CASINO RD & RAINIER DR - WB
		allStops.put("4255", "408"); // E CASINO RD & XAVIER WAY - WB
		allStops.put("4270", "409"); // E CASINO RD & 8TH AVE SE - WB
		allStops.put("1425", "41"); // COLBY AVE & PACIFIC AVE - SB
		allStops.put("6190", "410"); // 100TH ST SE & 7TH AVE SE - EB
		allStops.put("6195", "411"); // 100TH ST SE & 100TH PL SE - EB
		allStops.put("6085", "412"); // 7TH AVE SE & SE EVERETT MALL WAY - NB
		allStops.put("6065", "413"); // 7TH AVE SE & 93RD ST SE - NB
		allStops.put("6055", "414"); // 7TH AVE SE & 92ND ST SE - NB
		allStops.put("6050", "415"); // 7TH AVE SE & 90TH PL SE - NB
		allStops.put("6040", "416"); // 7TH AVE SE & 87TH ST SE - NB
		allStops.put("6005", "417"); // 7TH AVE SE & 84TH ST SE - NB
		allStops.put("4280", "418"); // E CASINO RD & 8TH AVE SE - EB
		allStops.put("4260", "419"); // E CASINO RD & XAVIER WAY - EB
		allStops.put("1490", "42"); // COLBY AVE & 32ND ST - SB
		allStops.put("4245", "420"); // E CASINO RD & RAINIER DR - EB
		allStops.put("4240", "421"); // E CASINO RD & HIGHLAND DR - NB
		allStops.put("4235", "422"); // BEVERLY BLVD & 75TH ST SE - NB
		allStops.put("4143", "423"); // BEVERLY BLVD & 72ND ST SE - NB
		allStops.put("4120", "424"); // BEVERLY BLVD & MADISON - NB
		allStops.put("4110", "425"); // BEVERLY BLVD & PALM AVE - NB
		allStops.put("4100", "426"); // BEVERLY BLVD & WETMORE AVE - NB
		allStops.put("4090", "427"); // COLBY AVE & 60TH ST SE - NB
		allStops.put("4075", "428"); // COLBY AVE & 55TH ST SE - NB
		allStops.put("3330", "429"); // COLBY AVE & 52ND ST SE - NB
		allStops.put("1500", "43"); // COLBY AVE & 34TH ST - SB
		allStops.put("3305", "430"); // COLBY AVE & ALTA DR - NB
		allStops.put("3295", "431"); // COLBY AVE & 47TH ST SE - NB
		allStops.put("3260", "432"); // COLBY AVE & 43RD ST SE - NB
		allStops.put("1270", "433"); // COLBY AVE & 26TH ST - NB
		allStops.put("1250", "434"); // COLBY AVE & 24TH ST - NB
		allStops.put("1240", "435"); // COLBY AVE & 23RD ST - NB
		allStops.put("1210", "436"); // COLBY AVE & 21ST ST - NB
		allStops.put("1200", "437"); // COLBY AVE & 19TH ST - NB
		allStops.put("1160", "438"); // COLBY AVE & 17TH ST - NB
		allStops.put("1155", "439"); // COLBY AVE & 15TH ST - NB
		allStops.put("1510", "44"); // COLBY AVE & 36TH ST - SB
		allStops.put("1140", "440"); // COLBY AVE & 13TH ST - NB
		allStops.put("1093", "441"); // COLBY AVE & 10TH ST - NB
		allStops.put("1090", "442"); // WETMORE AVE & 8TH ST - NB
		allStops.put("1085", "443"); // WETMORE AVE & 6TH ST - NB
		allStops.put("1080", "444"); // ALVERSON BLVD & 4TH ST - NB
		allStops.put("1075", "445"); // ALVERSON BLVD & 2ND ST - NB
		allStops.put("1010", "446"); // W MARINE VIEW DR & BRIDGE WAY - EB
		allStops.put("3070", "447"); // W MUKILTEO BLVD & OLYMPIC BLVD - WB
		allStops.put("3085", "448"); // W MUKILTEO BLVD & RIDGEMONT  DR - WB
		allStops.put("3100", "449"); // W MUKILTEO BLVD & SEAHURST AVE - WB
		allStops.put("1530", "45"); // COLBY AVE & 39TH ST - SB
		allStops.put("3110", "450"); // W MUKILTEO BLVD & GLENWOOD AVE - WB
		allStops.put("3120", "451"); // W MUKILTEO BLVD & DOVER - WB
		allStops.put("3130", "452"); // W MUKILTEO BLVD & HARBOR LN - WB
		allStops.put("3135", "453"); // W MUKILTEO BLVD & KIRBY PL - WB
		allStops.put("3145", "454"); // W MUKILTEO BLVD & 23RD AVE W - WB
		allStops.put("3160", "455"); // W MUKILTEO BLVD & SEAVIEW WAY - WB
		allStops.put("3165", "456"); // W MUKILTEO BLVD & GARDNER AVE - WB
		allStops.put("3175", "457"); // W MUKILTEO BLVD & 33RD AVE W - WB
		allStops.put("3190", "458"); // W MUKILTEO BLVD & SOUND AVE - WB
		allStops.put("3200", "459"); // W MUKILTEO BLVD & UPLAND AVE - WB
		allStops.put("1540", "46"); // 41ST & COLBY AVE - WB
		allStops.put("3210", "460"); // W MUKILTEO BLVD & MUKILTEO LN - WB
		allStops.put("3220", "461"); // 5TH ST & PROSPECT AVE - WB
		allStops.put("3225", "462"); // 5TH ST & LOVELAND AVE - WB
		allStops.put("3245", "463"); // 5TH ST & LINCOLN AVE - WB
		allStops.put("3250", "464"); // SR 525 & FRONT ST - SB DROPOFF ONLY
		allStops.put("1465", "465"); // MUKILTEO FERRY TERMINAL
		allStops.put("1455", "466"); // SR 525 & 3RD ST - SB
		allStops.put("3240", "467"); // 5TH ST & LINCOLN AVE - EB
		allStops.put("3235", "468"); // 5TH ST & LOVELAND AVE - EB
		allStops.put("3215", "469"); // 5TH ST & PROSPECT AVE - EB
		allStops.put("1545", "47"); // 41ST ST & RUCKER AVE - WB
		allStops.put("3205", "470"); // W MUKILTEO BLVD & LAMAR DR - EB
		allStops.put("3195", "471"); // W MUKILTEO BLVD & UPLAND AVE - EB
		allStops.put("3185", "472"); // W MUKILTEO BLVD & SOUND AVE - EB
		allStops.put("3180", "473"); // W MUKILTEO BLVD & 33RD AVE W - EB
		allStops.put("3170", "474"); // W MUKILTEO BLVD & OCEAN AVE - EB
		allStops.put("3155", "475"); // W MUKILTEO BLVD & SEAVIEW WAY - EB
		allStops.put("3150", "476"); // W MUKILTEO BLVD & 23RD AVE W - EB
		allStops.put("3140", "477"); // W MUKILTEO BLVD & KIRBY PL - EB
		allStops.put("3125", "478"); // W MUKILTEO BLVD & HARBOR LN - EB
		allStops.put("3115", "479"); // W MUKILTEO BLVD & GREELY ST - EB
		allStops.put("3030", "48"); // E MUKILTEO BLVD & 42ND ST - WB
		allStops.put("3105", "480"); // W MUKILTEO BLVD & GLENWOOD AVE - EB
		allStops.put("3095", "481"); // W MUKILTEO BLVD & SEAHURST AVE - EB
		allStops.put("3090", "482"); // W MUKILTEO BLVD & GLENHAVEN DR - EB
		allStops.put("1054", "483"); // COLLEGE STATION - BAY D - NB
		allStops.put("2050", "484"); // RAINIER AVE & 12TH ST - NB
		allStops.put("2045", "485"); // RAINIER AVE & 11TH ST - NB
		allStops.put("2030", "486"); // 11TH ST & POPLAR ST - EB
		allStops.put("2065", "487"); // POPLAR ST & 12TH ST - SB
		allStops.put("2100", "488"); // 15TH ST & FULTON ST - EB
		allStops.put("2105", "489"); // 15TH ST & MAPLE ST - EB
		allStops.put("3045", "49"); // E MUKILTEO BLVD & PIGEON CREEK RD - WB
		allStops.put("2230", "490"); // WALNUT ST & 24TH ST - SB
		allStops.put("2285", "491"); // EVERETT AVE & WALNUT ST - WB
		allStops.put("2342", "492"); // SMITH AVE & 35TH ST - SB
		allStops.put("2345", "493"); // SMITH AVE & 36TH ST - SB
		allStops.put("4000", "494"); // S 3RD AVE & 42ND ST - SB
		allStops.put("4010", "495"); // S 3RD AVE & 43RD ST - SB
		allStops.put("4020", "496"); // S 3RD AVE & 45TH ST - SB
		allStops.put("4030", "497"); // S 2ND AVE & 49TH ST - SB
		allStops.put("4045", "498"); // S 2ND AVE & EUGENE ST - SB
		allStops.put("4050", "499"); // S 2ND AVE & MAIN ST - SB
		allStops.put("6268", "5"); // 3RD AVE SE & SE EVERETT MALL WAY - SB
		allStops.put("3080", "50"); // DOGWOOD DR & W MUKILTEO BLVD - SB
		allStops.put("4177", "500"); // BROADWAY & MADISON ST - SB
		allStops.put("4169", "501"); // BROADWAY & MONROE AVE - SB
		allStops.put("4161", "502"); // BROADWAY & 74TH ST SE - SB
		allStops.put("4232", "503"); // BROADWAY & 79TH ST SE - SB
		allStops.put("4248", "504"); // BEVERLY BLVD & BROADWAY - SB
		allStops.put("6125", "505"); // 19TH AVE SE & BURLEY DR - SB
		allStops.put("6130", "506"); // 19TH AVE SE & 96TH PL SE - SB
		allStops.put("6135", "507"); // 19TH AVE SE & 98TH ST SE - SB
		allStops.put("6377", "508"); // 19TH AVE SE & 101ST ST SE - SB
		allStops.put("6140", "509"); // 19TH AVE SE & 102ND ST SE - SB
		allStops.put("3340", "51"); // DOGWOOD DR & 48TH ST SW - SB
		allStops.put("6145", "510"); // 19TH AVE SE & 106TH PL SE - SB
		allStops.put("6150", "511"); // 19TH AVE SE & 110TH ST SE - SB
		allStops.put("6402", "512"); // 19TH AVE SE & 113TH ST SE - EB
		allStops.put("6247", "513"); // 19TH AVE SE & 116TH ST SE - SB
		allStops.put("6430", "514"); // 121ST ST SE & 19TH AVE SE - WB
		allStops.put("6355", "515"); // 121ST ST SE & SILVER LAKE DR  - WB
		allStops.put("6350", "516"); // 121ST ST SE & SILVER LAKE RD - WB
		allStops.put("6200", "517"); // SILVER LAKE RD & 116TH ST SE - NB
		allStops.put("6343", "518"); // SILVER LAKE RD & SILVER LAKE BEACH - NB
		allStops.put("6160", "519"); // 112TH ST SE & SILVER LAKE RD - WB
		allStops.put("3345", "52"); // DOGWOOD DR & ALDER ST - SB
		allStops.put("6331", "520"); // South Everett Freeway Station - Bay 1
		allStops.put("6165", "521"); // 112TH ST SE & 10TH AVE SE - WB
		allStops.put("6170", "522"); // 7TH AVE SE & 112TH ST SE - NB
		allStops.put("6175", "523"); // 7TH AVE SE & 109TH ST SE - NB
		allStops.put("6180", "524"); // 7TH AVE SE & 105TH ST SE - NB
		allStops.put("6185", "525"); // 7TH AVE SE & BRUSKRUD RD - NB
		allStops.put("4159", "526"); // 75TH ST SE & MCDOUGALL AVE - EB
		allStops.put("4151", "527"); // RIDGEWOOD DR & TIMBER HILL DR - SB
		allStops.put("4157", "528"); // PANAVIEW BLVD & LARLIN DR - SB
		allStops.put("4154", "529"); // LARLIN DR & PANAVIEW BLVD - NB
		allStops.put("3365", "53"); // BEVERLY LN & SUNSET LN - SB
		allStops.put("4156", "530"); // SUNRISE DR & PANAVIEW BLVD - NB
		allStops.put("4158", "531"); // 75TH ST SE & MCDOUGALL AVE - WB
		allStops.put("2502", "532"); // EASTMONT PARK & RIDE BAY 3 - WB
		allStops.put("6310", "533"); // 100TH ST SE & 100TH PL SE - WB
		allStops.put("6305", "534"); // 100TH ST SE & 7TH AVE SE - WB
		allStops.put("6315", "535"); // 7TH AVE SE & 103RD PL SE - SB
		allStops.put("6320", "536"); // 7TH AVE SE & 105TH PL SE - SB
		allStops.put("6325", "537"); // 7TH AVE SE & 110TH ST SE - SB
		allStops.put("6330", "538"); // 112TH ST SE & 9TH AVE SE - EB
		allStops.put("6332", "539"); // South Everett Freeway Station - Bay 4
		allStops.put("3375", "54"); // BEVERLY LN & HIGHLAND RD - SB
		allStops.put("6335", "540"); // 112TH ST SE & SILVER LAKE RD - EB
		allStops.put("6340", "541"); // SILVER LAKE RD & SILVER LAKE BEACH - SB
		allStops.put("6345", "542"); // SILVER LAKE RD & 116TH ST SE - SB
		allStops.put("6205", "543"); // SILVER LAKE RD & 119TH PL SE - SB
		allStops.put("6210", "544"); // SILVER LAKE RD & 13TH DR SE - EB
		allStops.put("6215", "545"); // 121ST ST SE & 17TH AVE SE - EB
		allStops.put("6220", "546"); // 121ST ST SE & 19TH AVE SE - EB
		allStops.put("6425", "547"); // 19TH AVE SE & 121ST ST SE - NB
		allStops.put("6420", "548"); // 19TH AVE SE & LAKE HEIGHTS DR - NB
		allStops.put("6410", "549"); // 19TH AVE SE & 116TH ST SE - NB
		allStops.put("3500", "55"); // BEVERLY LN & PECKS - SB
		allStops.put("6405", "550"); // 19TH AVE SE & 113TH ST SE - WB
		allStops.put("6365", "551"); // 19TH AVE SE & 110TH ST SE - NB
		allStops.put("6370", "552"); // 19TH AVE SE & 105TH ST SE - NB
		allStops.put("6375", "553"); // 19TH AVE SE & 102ND ST SE - NB
		allStops.put("6380", "554"); // 19TH AVE SE & 100TH ST SE - NB
		allStops.put("6388", "555"); // 19TH AVE SE & 96TH PL SE - NB
		allStops.put("6390", "556"); // 19TH AVE SE & BURLEY DR - NB
		allStops.put("4249", "557"); // BROADWAY & BEVERLY BLVD - NB
		allStops.put("4231", "558"); // BROADWAY & 79TH ST SE - NB
		allStops.put("4162", "559"); // BROADWAY & 75TH ST SE - NB
		allStops.put("3545", "56"); // BEVERLY LN & E BEECH ST - SB
		allStops.put("4164", "560"); // BROADWAY & 73RD ST SE - NB
		allStops.put("4168", "561"); // BROADWAY & ADAMS AVE - NB
		allStops.put("4065", "562"); // LOWELL RD & S 3RD AVE - EB
		allStops.put("4060", "563"); // S 2ND AVE & ZILLAH ST - NB
		allStops.put("4040", "564"); // S 2ND AVE & EUGENE ST - NB
		allStops.put("4035", "565"); // S 2ND AVE & 49TH ST - NB
		allStops.put("4025", "566"); // S 3RD AVE & 46TH ST - NB
		allStops.put("4015", "567"); // S 3RD AVE & 44TH ST - NB
		allStops.put("4005", "568"); // S 3RD AVE & 42ND ST - NB
		allStops.put("2343", "569"); // SMITH AVE & 36TH ST - NB
		allStops.put("3550", "57"); // BEVERLY LN & MADISON ST - SB
		allStops.put("2280", "570"); // EVERETT AVE & CEDAR - EB
		allStops.put("2235", "571"); // WALNUT ST & 26TH ST - NB
		allStops.put("2225", "572"); // WALNUT ST & 24TH ST - NB
		allStops.put("2110", "573"); // 15TH ST & WALNUT ST - WB
		allStops.put("2095", "574"); // 15TH ST & BAKER AVE - WB
		allStops.put("2090", "575"); // POPLAR ST & 14TH ST - NB
		allStops.put("2060", "576"); // POPLAR ST & 12TH ST - NB
		allStops.put("2035", "577"); // 11TH ST & POPLAR ST - WB
		allStops.put("2040", "578"); // 11th St & RAINIER AVE - WB
		allStops.put("2055", "579"); // RAINIER AVE & 12TH ST - SB
		allStops.put("3565", "58"); // BEVERLY LN & S CABOT RD - SB
		allStops.put("1472", "580"); // SR 525 & GOAT TRAIL RD - SB
		allStops.put("1470", "581"); // SR 525 & CLOVER LN - SB
		allStops.put("1468", "582"); // SR 525 & 76TH ST SW - SB
		allStops.put("1469", "583"); // SR 525 & 80TH ST SW - SB
		allStops.put("1456", "584"); // SR 525 & 81ST PL SW - SB
		allStops.put("7380", "585"); // 84TH ST SW & 44TH AVE W - EB
		allStops.put("2484", "586"); // AIRPORT RD & W CASINO RD - SB
		allStops.put("7375", "587"); // 84TH ST SW & 44TH AVE W - WB
		allStops.put("964", "588"); // SR 525 & 84TH ST SW - NB
		allStops.put("963", "589"); // SR 525 & 80TH ST SW - NB
		allStops.put("3567", "59"); // BEVERLY LN & 72ND ST SE - SB
		allStops.put("973", "590"); // SR 525 & 76TH ST SW - NB
		allStops.put("967", "591"); // SR 525 & CLOVER LANE - NB
		allStops.put("972", "592"); // SR 525 & 15TH PL - NB
		allStops.put("968", "593"); // SR 525 & GOAT TRAIL RD - NB
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

