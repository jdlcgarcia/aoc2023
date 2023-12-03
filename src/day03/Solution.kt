package day03

import common.readInput

fun main() {
    val testInput = readInput("day03")
//    val testInput = loadTestInput()

    val engine: MutableList<String> = mutableListOf()

    for (line in testInput) {
        engine.add(line)
    }

    clearNonPartNumbers(engine)
}

fun clearNonPartNumbers(engine: MutableList<String>) {
    var rowIndex = 0
    var sumOfPartNumbers = 0

    while (rowIndex < engine.size) {
        sumOfPartNumbers += processLine(engine, rowIndex)
        rowIndex++
    }

    println("What is the sum of all of the part numbers in the engine schematic?")
    println(sumOfPartNumbers.toString())
}

private fun processLine(
    engine: MutableList<String>,
    rowIndex: Int
): Int {
    var colIndex = 0
    var sumOfPartNumbersPerLine = 0
    while (colIndex < engine[rowIndex].length) {
        if (engine[rowIndex][colIndex].isDigit()) {
            val foundNumberInfo = findFullNumber(engine, rowIndex, colIndex)
            val number = engine[rowIndex].substring(foundNumberInfo["start"]!!, (foundNumberInfo["end"]!! +1)).toInt()
            if (findSymbolSurroundingNumber(engine, rowIndex, foundNumberInfo)) {
                sumOfPartNumbersPerLine += number
            }

            colIndex = foundNumberInfo["end"]!!
        }
        colIndex++
    }

    return sumOfPartNumbersPerLine
}

fun findSymbolSurroundingNumber(engine: MutableList<String>, rowIndex: Int, foundNumberInfo: MutableMap<String, Int>): Boolean {
    for(rowNumber in (rowIndex-1)..(rowIndex +1)) {
        if (rowNumber in 0..<engine.size) {
            for(columnNumber in (foundNumberInfo["start"]!! -1)..(foundNumberInfo["end"]!! +1)) {
                if (columnNumber in 0..<engine[0].length) {
//                    if (rowNumber == rowIndex && columnNumber !in foundNumberInfo["start"]!!..foundNumberInfo["end"]!!) {
//                        println("row "+rowNumber+", col "+columnNumber + ": " + engine[rowNumber][columnNumber])
                        if (!engine[rowNumber][columnNumber].isDigit() && engine[rowNumber][columnNumber] != '.') {
                            return true;
                        }
//                    }

                }
            }
        }
    }

    return false;
}

fun findFullNumber(engine: MutableList<String>, rowIndex: Int, colIndex: Int): MutableMap<String, Int> {
    val foundNumber = mutableMapOf(
        "start" to colIndex,
        "end" to colIndex
    )
    var actualIndex = colIndex + 1

    while (actualIndex < engine[rowIndex].length && engine[rowIndex][actualIndex].isDigit()) {
        foundNumber["end"] = actualIndex
        actualIndex++
    }

    return foundNumber;
}

fun loadTestInput(): Array<String> {
    val multilineString = """
467..114..
...*......
..35..633.
......#...
617*......
.....+.58.
..592.....
......755.
...$.*....
.664.598..
    """.trimIndent()

    // Split the multiline string into an array of strings
    val stringArray = multilineString.split("\n").toTypedArray()

    return stringArray
}