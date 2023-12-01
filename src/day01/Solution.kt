package day01

import common.append
import common.readInput

fun main() {
    val testInput = readInput("day01")
//    val testInput = loadTestInput()
    var sum = 0

    for (line in testInput) {
//        sum += searchFirstAndLast(line)
        sum += searchFirstAndLastWithSpelling(line)
    }

    println("What is the sum of all of the calibration values?")
    println(sum.toString())
}

fun searchFirstAndLast(line: String): Int {
    var firstDigit = ""
    var lastDigit = ""
    for (character in line) {
        if (character.isDigit()) {
            if (firstDigit == "") {
                firstDigit = character.toString()
            }
            lastDigit = character.toString()
        }
    }

    return (firstDigit + lastDigit).toInt()
}

fun searchFirstAndLastWithSpelling(line: String): Int {
    val first = searchFirstFromLeft(line)
    val last = searchFirstFromRight(line)

    return first * 10 + last
}

fun searchFirstFromRight(line: String): Int {
    val digitMap = mapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
    )

    var index = line.length -1
    while (index > 0) {
        if (line[index].isDigit()) {
            return line[index].digitToInt()
        }

        for (digit in digitMap.keys) {
            if (index + digit.length <= line.length) {
                val substringToCheck = line.substring(index, index + digit.length)
                if (substringToCheck == digit) {
                    return digitMap[digit]!!
                }
            }
        }

        index--
    }

    return line[0].digitToInt();
}

fun searchFirstFromLeft(line: String): Int {
    val digitMap = mapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
    )

    var index = 0
    while (index < line.length) {
        if (line[index].isDigit()) {
            return line[index].digitToInt()
        }

        for (digit in digitMap.keys) {
            if (index + digit.length <= line.length) {
                val substringToCheck = line.substring(index, index + digit.length)
                if (substringToCheck == digit) {
                    return digitMap[digit]!!
                }
            }
        }

        index++
    }

    return 0;
}


fun loadTestInput(): Array<String> {
    val multilineString = """
two1nine
eightwothree
abcone2threexyz
xtwone3four
4nineeightseven2
zoneight234
7pqrstsixteen
    """.trimIndent()

    // Split the multiline string into an array of strings
    val stringArray = multilineString.split("\n").toTypedArray()

    return stringArray
}