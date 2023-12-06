package day05

interface Almanac {
    val seeds: List<Long>
    val seed2soil: List<RangeMap>
    val soil2fertilizer: List<RangeMap>
    val fertilizer2water: List<RangeMap>
    val water2light: List<RangeMap>
    val light2temperature: List<RangeMap>
    val temperature2humidity: List<RangeMap>
    val humidity2location: List<RangeMap>

    fun seedsAsRange(): List<Pair<Long, Long>> {
        val range: MutableList<Pair<Long, Long>> = mutableListOf()
        var counter = 0
        while (counter < seeds.size) {
            range.add(Pair(seeds[counter], seeds[counter + 1]))
            counter += 2
        }

        return range
    }

    fun findMinLocationTopDown(): Long {
        var minLocation = 99999999999999
        for(seed in seeds) {
            val soil = translate(seed, seed2soil)
            val fertilizer = translate(soil, soil2fertilizer)
            val water = translate(fertilizer, fertilizer2water)
            val light = translate(water, water2light)
            val temperature = translate(light, light2temperature)
            val humidity = translate(temperature, temperature2humidity)
            val location = translate(humidity, humidity2location)

            if (location < minLocation) {
                minLocation = location
            }
        }

        return minLocation
    }

    fun translate(input: Long, ruleList: List<RangeMap>): Long {
        for (rule in ruleList) {
            if (input in rule.getSource()..<(rule.getSource()) + rule.getLength()) {
                val offset = input - rule.getSource()
                return rule.getDestination() + offset
            }
        }

        return input
    }

    fun findMinLocationBottomUp(): Long {
        val humidity = findSourceFromLowerDestination(humidity2location)

        return humidity
    }

    fun findSourceFromLowerDestination(ruleList: List<RangeMap>): Long {
        var minDestination = 99999999999999
        for(rule in ruleList) {
            if (rule.getDestination() < minDestination) {
                minDestination = rule.getDestination()
            }
        }

        val possibleMinimum = inverseTranslation(0, ruleList)

        if (possibleMinimum < minDestination) {
            minDestination = possibleMinimum
        }

        return minDestination
    }

    fun inverseTranslation(input: Long, ruleList: List<RangeMap>): Long {
        TODO("Not yet implemented")
    }
}