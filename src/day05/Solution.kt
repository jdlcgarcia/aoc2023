package day05

fun main() {
    val almanac: Almanac = TestAlmanac()

    println("What is the lowest location number that corresponds to any of the initial seed numbers?")
    println(almanac.findMinLocationTopDown().toString())

    println("We will now check the ranges bottom-up")
    println(almanac.findMinLocationBottomUp().toString())
}
