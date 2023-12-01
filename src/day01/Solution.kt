package day01

import common.readInput

fun main() {
    val testInput = readInput("day01")
//    val testInput = loadTestInput()
    var sum = 0

    for (line in testInput) {
        sum += searchFirstAndLast(line)
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


fun loadTestInput(): Array<String> {
    val multilineString = """
1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet
    """.trimIndent()

    // Split the multiline string into an array of strings
    val stringArray = multilineString.split("\n").toTypedArray()

    return stringArray
}