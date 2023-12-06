package day05

class RangeMap(
    private val destination: Long,
    private val source: Long,
    private val length: Long
) {

    fun getDestination(): Long {
        return destination
    }

    fun getSource(): Long {
        return source
    }

    fun getLength(): Long {
        return length
    }
}