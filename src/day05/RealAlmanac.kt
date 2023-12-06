package day05

data class RealAlmanac(
    override val seeds: List<Long> = listOf(3640772818, 104094365, 1236480411, 161072229, 376099792, 370219099, 1590268366, 273715765, 3224333694, 68979978, 2070154278, 189826014, 3855332650, 230434913, 3033760782, 82305885, 837883389, 177854788, 2442602612, 571881366),
    override val seed2soil: List<RangeMap> = listOf(
        RangeMap(496269031, 1203272644, 52136246),
        RangeMap(548405277, 496269031, 457095898),
        RangeMap(1005501175, 953364929, 249907715),
    ),
    override val soil2fertilizer: List<RangeMap> = listOf(
        RangeMap(217408321, 2086205436, 25053699),
        RangeMap(2604208456, 1670861921, 31003781),
        RangeMap(1631572552, 0, 258383552),
        RangeMap(129225554, 3768288787, 36192668),
        RangeMap(2421205388, 2905533654, 126666762),
        RangeMap(242462020, 3399542287, 357404885),
        RangeMap(866152503, 3032200416, 253960559),
        RangeMap(2039921781, 2262442546, 381283607),
        RangeMap(2635212237, 2714844607, 190689047),
        RangeMap(3613008578, 1753855801, 23976114),
        RangeMap(3636984692, 1503365158, 167496763),
        RangeMap(1340671861, 2111259135, 274956),
        RangeMap(1889956104, 806620565, 149965677),
        RangeMap(0, 3286160975, 113381312),
        RangeMap(2987089260, 956586242, 546778916),
        RangeMap(2547872150, 3756947172, 11341615),
        RangeMap(3846919647, 3807789063, 43277850),
        RangeMap(3533868176, 258383552, 79140402),
        RangeMap(165418222, 1701865702, 51990099),
        RangeMap(1120113062, 586061766, 220558799),
        RangeMap(2559213765, 2217447855, 44994691),
        RangeMap(3807789063, 4255836712, 39130584),
        RangeMap(3890197497, 3851066913, 404769799),
        RangeMap(1340946817, 1777831915, 42087923),
        RangeMap(2881175496, 2111534091, 105913764),
        RangeMap(113381312, 2643726153, 15844242),
        RangeMap(1383034740, 337523954, 248537812),
        RangeMap(2825901284, 2659570395, 55274212),
        RangeMap(599866905, 1819919838, 266285598),
    ),
    override val fertilizer2water: List<RangeMap> = listOf(
        RangeMap(3950520280, 1751042330, 139651634),
        RangeMap(936578795, 3912173308, 42397072),
        RangeMap(3553681000, 1722281506, 28760824),
        RangeMap(697953317, 651809140, 90189394),
        RangeMap(3582441824, 876081661, 368078456),
        RangeMap(978975867, 2358439651, 252255693),
        RangeMap(1495879532, 2678320518, 199775133),
        RangeMap(1910380638, 3308279888, 122339216),
        RangeMap(3355092099, 1561901004, 91630618),
        RangeMap(3187667509, 2033753243, 70292073),
        RangeMap(2752202873, 3816184128, 41568037),
        RangeMap(648600286, 479585511, 49353031),
        RangeMap(3149600631, 2356473769, 1965882),
        RangeMap(1695654665, 2629130810, 49189708),
        RangeMap(201901143, 385568770, 94016741),
        RangeMap(536376004, 741998534, 3182157),
        RangeMap(2472303091, 3954570380, 279899782),
        RangeMap(539558161, 257732262, 15304877),
        RangeMap(3131165165, 2610695344, 18435466),
        RangeMap(3446722717, 1890693964, 106958283),
        RangeMap(2793770910, 1653531622, 40823934),
        RangeMap(9849113, 65680232, 192052030),
        RangeMap(2878736712, 2104045316, 252428453),
        RangeMap(1792836692, 2878095651, 117543946),
        RangeMap(2172585320, 1244160117, 273599019),
        RangeMap(2060645804, 3884012463, 28160845),
        RangeMap(3257959582, 3719051611, 97132517),
        RangeMap(408449515, 745180691, 127926489),
        RangeMap(876081661, 4234470162, 60497134),
        RangeMap(1231231560, 3043631916, 264647972),
        RangeMap(3151566513, 1997652247, 36100996),
        RangeMap(2446184339, 3430619104, 26118752),
        RangeMap(803816626, 582518586, 69290554),
        RangeMap(554863038, 9849113, 40157204),
        RangeMap(2146325022, 3857752165, 26260298),
        RangeMap(788142711, 50006317, 15673915),
        RangeMap(295917884, 273037139, 112531631),
        RangeMap(2834594844, 1517759136, 44141868),
        RangeMap(4090171914, 3456737856, 204795382),
        RangeMap(2088806649, 3661533238, 57518373),
        RangeMap(1744844373, 2995639597, 47992319),
        RangeMap(2032719854, 1694355556, 27925950),
        RangeMap(595020242, 528938542, 53580044),
    ),
    override val water2light: List<RangeMap> = listOf(
        RangeMap(556810106, 840812947, 14926117),
        RangeMap(2598413684, 2184905392, 114045192),
        RangeMap(2130064037, 1600958027, 248227533),
        RangeMap(1271028210, 1253957270, 39538107),
        RangeMap(3521286912, 4262821917, 32145379),
        RangeMap(1930562940, 1944404618, 64932992),
        RangeMap(4252373354, 3302720391, 42593942),
        RangeMap(1109026743, 279496091, 162001467),
        RangeMap(725777554, 2565853410, 3969864),
        RangeMap(2712458876, 1330352326, 185715465),
        RangeMap(4039742261, 3173278185, 129442206),
        RangeMap(0, 2064417497, 120487895),
        RangeMap(299311037, 855739064, 257499069),
        RangeMap(729747418, 1849185560, 95219058),
        RangeMap(1373001379, 767226476, 66231296),
        RangeMap(571736223, 688212171, 79014305),
        RangeMap(1878676528, 2890412515, 51886412),
        RangeMap(2898174341, 682278717, 5933454),
        RangeMap(1781236499, 441497558, 97440029),
        RangeMap(3090089298, 3673052565, 50139248),
        RangeMap(1365646204, 833457772, 7355175),
        RangeMap(1738475707, 2412172480, 42760792),
        RangeMap(1995495932, 2569823274, 134568105),
        RangeMap(3193548680, 3476912261, 196140304),
        RangeMap(824966476, 538937587, 143341130),
        RangeMap(3553432291, 3723191813, 486309970),
        RangeMap(3140228546, 4209501783, 53320134),
        RangeMap(968307606, 1113238133, 140719137),
        RangeMap(4169184467, 3090089298, 83188887),
        RangeMap(650750528, 204469065, 75027026),
        RangeMap(1439232675, 2704391379, 186021136),
        RangeMap(2511835025, 1516067791, 84890236),
        RangeMap(1625253811, 2298950584, 113221896),
        RangeMap(3389688984, 3345314333, 131597928),
        RangeMap(2378291570, 0, 22623317),
        RangeMap(2596725261, 2942298927, 1688423),
        RangeMap(1310566317, 2009337610, 55079887),
        RangeMap(2940964744, 201446459, 3022606),
        RangeMap(120487895, 22623317, 178823142),
        RangeMap(2904107795, 1293495377, 36856949),
        RangeMap(2400914887, 2454933272, 110920138),
    ),
    override val light2temperature: List<RangeMap> = listOf(
        RangeMap(1244459013, 624435822, 80444775),
        RangeMap(2608592263, 3309263777, 172991510),
        RangeMap(3165402867, 2278806547, 335097905),
        RangeMap(292819381, 1643978777, 105413752),
        RangeMap(704475267, 462426854, 15399493),
        RangeMap(3696584161, 2678497330, 345840247),
        RangeMap(2891254573, 3613542439, 34162874),
        RangeMap(1894523870, 281665589, 180761265),
        RangeMap(1706897891, 1456352798, 187625979),
        RangeMap(398233133, 1877125477, 198159658),
        RangeMap(4176101046, 3482255287, 104541624),
        RangeMap(2278806547, 3662029939, 329785716),
        RangeMap(3500500772, 4098883907, 196083389),
        RangeMap(4280642670, 3647705313, 14324626),
        RangeMap(4149492660, 3024337577, 11203522),
        RangeMap(85784517, 0, 207034864),
        RangeMap(2925417447, 3231118601, 78145176),
        RangeMap(0, 1749392529, 85784517),
        RangeMap(4160696182, 3215713737, 15404864),
        RangeMap(4042424408, 3991815655, 107068252),
        RangeMap(1129076520, 207034864, 74630725),
        RangeMap(596392791, 1348270322, 108082476),
        RangeMap(3100809989, 2613904452, 64592878),
        RangeMap(1326100451, 1114082357, 234187965),
        RangeMap(2864509045, 3586796911, 26745528),
        RangeMap(2781583773, 3132788465, 82925272),
        RangeMap(1560288416, 477826347, 146609475),
        RangeMap(3003562623, 3035541099, 97247366),
        RangeMap(719874760, 704880597, 409201760),
        RangeMap(1324903788, 1875928814, 1196663),
        RangeMap(1203707245, 1835177046, 40751768),
    ),
    override val temperature2humidity: List<RangeMap> = listOf(
        RangeMap(2622049454, 736812858, 79169969),
        RangeMap(3979548277, 2854489162, 116161222),
        RangeMap(0, 2175018874, 84480806),
        RangeMap(567798788, 2400631546, 48501534),
        RangeMap(3627076350, 2837901836, 16587326),
        RangeMap(1459224370, 1289368272, 21397154),
        RangeMap(3018037189, 3252694507, 93925363),
        RangeMap(4095709499, 4063232797, 21404553),
        RangeMap(1675574530, 2560175285, 695067),
        RangeMap(650203851, 328659590, 327259736),
        RangeMap(3143763337, 3475937023, 49576),
        RangeMap(1591893253, 2091337597, 83681277),
        RangeMap(3655324442, 3516768137, 39649206),
        RangeMap(1125784995, 2259499680, 94582805),
        RangeMap(1082589333, 280432563, 43195662),
        RangeMap(1676269597, 1011614859, 3965286),
        RangeMap(3955996260, 4039680780, 23552017),
        RangeMap(2701219423, 684725863, 52086995),
        RangeMap(977463587, 2387091631, 13539915),
        RangeMap(3643663676, 3346619870, 11660766),
        RangeMap(3143812913, 3556417343, 483263437),
        RangeMap(2907111949, 3358280636, 110925240),
        RangeMap(2293944099, 2615629615, 132579811),
        RangeMap(991003502, 920029028, 91585831),
        RangeMap(1513630670, 1015580145, 78262583),
        RangeMap(196718861, 1310765426, 316320664),
        RangeMap(1680234883, 1638774240, 331394507),
        RangeMap(2011629390, 815982827, 1882146),
        RangeMap(2874635247, 4084637350, 32476702),
        RangeMap(3701704795, 2998403042, 254291465),
        RangeMap(2426523910, 1093842728, 195525544),
        RangeMap(2837901836, 3475986599, 8980753),
        RangeMap(3694973648, 3469205876, 6731147),
        RangeMap(3111962552, 3484967352, 31800785),
        RangeMap(616300322, 662956301, 21769562),
        RangeMap(1220367800, 1627086090, 10492300),
        RangeMap(1480621524, 2354082485, 33009146),
        RangeMap(2846882589, 2970650384, 27752658),
        RangeMap(1352028950, 323628225, 5031365),
        RangeMap(2753306418, 655919326, 7036975),
        RangeMap(513039525, 2560870352, 54759263),
        RangeMap(84480806, 1637578390, 1195850),
        RangeMap(2013511536, 0, 280432563),
        RangeMap(85676656, 2449133080, 111042205),
        RangeMap(1357060315, 817864973, 102164055),
        RangeMap(638069884, 2748209426, 12133967),
        RangeMap(1230860100, 1970168747, 121168850),
    ),
    override val humidity2location: List<RangeMap> = listOf(
        RangeMap(3071447765, 3790677895, 35519893),
        RangeMap(501148922, 1470714761, 60946444),
        RangeMap(949413779, 3960084356, 1114317),
        RangeMap(2276139972, 547813284, 42132370),
        RangeMap(261623667, 0, 220957931),
        RangeMap(0, 220957931, 207965683),
        RangeMap(2629055810, 2988733812, 367963097),
        RangeMap(936813255, 2507216386, 12600524),
        RangeMap(3106967658, 2402339659, 33240399),
        RangeMap(909841910, 3356696909, 11084951),
        RangeMap(1030029700, 920191219, 341387512),
        RangeMap(2503236334, 3572469232, 125819476),
        RangeMap(1371417212, 1666455982, 273052538),
        RangeMap(2997018907, 3367781860, 25674024),
        RangeMap(3311094548, 2519816910, 468916902),
        RangeMap(2021404744, 1531661205, 83389724),
        RangeMap(3140208057, 1939508520, 59879232),
        RangeMap(259387264, 428923614, 2236403),
        RangeMap(950528096, 1334878052, 79501604),
        RangeMap(2446901229, 1414379656, 56335105),
        RangeMap(1644469750, 3393455884, 140294896),
        RangeMap(3022692931, 3698288708, 48754834),
        RangeMap(4042169428, 1999387752, 252797868),
        RangeMap(1805974329, 3981490698, 215430415),
        RangeMap(1784764646, 501148922, 21209683),
        RangeMap(889549885, 3961198673, 20292025),
        RangeMap(3780011450, 522358605, 10399946),
        RangeMap(2104794468, 1261578731, 73299321),
        RangeMap(3790411396, 3842084182, 118000174),
        RangeMap(2318272342, 2252185620, 113574154),
        RangeMap(4003450976, 3533750780, 38718452),
        RangeMap(2178093789, 4196921113, 98046183),
        RangeMap(3908411570, 3747043542, 43634353),
        RangeMap(562095366, 2435580058, 71636328),
        RangeMap(2431846496, 532758551, 15054733),
        RangeMap(920926861, 3826197788, 15886394),
        RangeMap(3952045923, 1615050929, 51405053),
        RangeMap(207965683, 431160017, 51421581),
        RangeMap(633731694, 2365759774, 36579885),
        RangeMap(670311579, 700952913, 219238306),
        RangeMap(3200087289, 589945654, 111007259),
    )
) : Almanac
