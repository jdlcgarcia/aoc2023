package day06

class Race(private val time: Long, private val distanceRecord: Long) {
    fun getTime(): Long {
        return time
    }

    fun getDistanceRecord(): Long {
        return distanceRecord
    }

    fun run(speed: Long, time: Long): Long {
        return speed * time
    }

    fun getVictories(): Long {
        var countVictories:Long = 0

        for (seconds in 0..time) {
            val distance = run(seconds, time - seconds)
            if (distance > distanceRecord) {
                countVictories++
            }
        }
        return countVictories
    }
}