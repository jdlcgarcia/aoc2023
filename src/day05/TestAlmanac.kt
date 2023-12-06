package day05

data class TestAlmanac(
    override val seeds: List<Long> = listOf(79, 14, 55, 13),
    override val seed2soil: List<RangeMap> = listOf(
        RangeMap(50, 98, 2),
        RangeMap(52, 50, 48),
    ),
    override val soil2fertilizer: List<RangeMap> = listOf(
        RangeMap(0, 15, 37),
        RangeMap(37, 52, 2),
        RangeMap(39, 0, 15),
    ),
    override val fertilizer2water: List<RangeMap> = listOf(
        RangeMap(49, 53, 8),
        RangeMap(0, 11, 42),
        RangeMap(42, 0, 7),
        RangeMap(57, 7, 4)
    ),
    override val water2light: List<RangeMap> = listOf(
        RangeMap(88, 18, 7),
        RangeMap(18, 25, 70),
    ),
    override val light2temperature: List<RangeMap> = listOf(
        RangeMap(45, 77, 23),
        RangeMap(81, 45, 19),
        RangeMap(68, 64, 13),
    ),
    override val temperature2humidity: List<RangeMap> = listOf(
        RangeMap(0, 69, 1),
        RangeMap(1, 0, 69),
    ),
    override val humidity2location: List<RangeMap> = listOf(
        RangeMap(60, 56, 37),
        RangeMap(56, 93, 4),
    )
) : Almanac {
    fun findHumidityOfLowerLocation(): Long {
        val min = 999999999999
        for(rule in humidity2location) {

        }

        return min
    }
}
