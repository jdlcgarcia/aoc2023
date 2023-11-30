package day0

import kotlin.io.path.Path
import kotlin.io.path.readLines

fun main() {
    val testInput = readInput()

    println(testInput[0])
}

fun readInput() = Path("src/day0/input.txt").readLines()