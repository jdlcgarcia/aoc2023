package day03

import common.readInput
import kotlin.math.max
import kotlin.math.min

fun main() {
    val testInput = readInput("day03")
//    val testInput = loadTestInput()

    val engine: MutableList<String> = mutableListOf()

    for (line in testInput) {
        engine.add(line)
    }

    clearNonPartNumbers(engine)
    findGear(engine)
}

fun findGear(engine: MutableList<String>) {
    var rowIndex = 0
    var sumOfGearRatios = 0

    while (rowIndex < engine.size) {
        sumOfGearRatios += findGearInRow(engine, rowIndex)
        rowIndex++
    }

    println("What is the sum of all of the gear ratios in your engine schematic?")
    println(sumOfGearRatios.toString())
}

fun findGearInRow(engine: MutableList<String>, rowIndex: Int): Int {
    var colIndex = 0
    var sumOfGearRatiosPerLine = 0

    while (colIndex < engine[rowIndex].length) {
        if (engine[rowIndex][colIndex] == '*') {
            sumOfGearRatiosPerLine += scanForNumberThatSurroundsSymbol(engine, rowIndex, colIndex)
        }
        colIndex++
    }

    return sumOfGearRatiosPerLine
}

private fun scanForNumberThatSurroundsSymbol(engine: MutableList<String>, rowIndex: Int, colIndex: Int): Int {
    var numbersAroundSymbol: MutableList<Int> = mutableListOf()
    for(rowNumber in max(0, rowIndex-1)..min(rowIndex +1, engine.size -1)) {
        var colNumber = max(0, (colIndex-1))
        while (colNumber <= min((colIndex +1), engine[rowIndex].length -1)) {
            if (!(rowNumber == rowIndex && colNumber == colIndex) && engine[rowNumber][colNumber].isDigit()) {
                val number = findCompleteNumber(engine, rowNumber, colNumber)
                numbersAroundSymbol.add(number)
                while (engine[rowNumber][colNumber].isDigit() && colNumber < min((colIndex +1), engine[rowIndex].length -1)) {
                    colNumber++
                }
            }
            colNumber++;
        }
    }

    if (numbersAroundSymbol.size == 2) {
        return numbersAroundSymbol.reduce { acc, item -> acc * item }
    }

    return 0;
}

private fun findCompleteNumber(
    engine: MutableList<String>,
    rowNumber: Int,
    colNumber: Int
): Int {
    //check at the left: if it's index 0, it's the beginning. If it's dot, it's also the beginning
    if (colNumber == 0 || !engine[rowNumber][colNumber-1].isDigit()) {
        val foundNumberInfo = findFullNumber(engine, rowNumber, colNumber)
        return parseNumber(engine, rowNumber, foundNumberInfo)
    }
    // if cell at left it's a number, recursive call!!
    return findCompleteNumber(engine, rowNumber, colNumber-1)
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
            val number = parseNumber(engine, rowIndex, foundNumberInfo)
            if (findSymbolSurroundingNumber(engine, rowIndex, foundNumberInfo)) {
                sumOfPartNumbersPerLine += number
            }

            colIndex = foundNumberInfo["end"]!!
        }
        colIndex++
    }

    return sumOfPartNumbersPerLine
}

private fun parseNumber(
    engine: MutableList<String>,
    rowIndex: Int,
    foundNumberInfo: MutableMap<String, Int>
) = engine[rowIndex].substring(foundNumberInfo["start"]!!, (foundNumberInfo["end"]!! + 1)).toInt()

fun findSymbolSurroundingNumber(engine: MutableList<String>, rowIndex: Int, foundNumberInfo: MutableMap<String, Int>): Boolean {
    for(rowNumber in (rowIndex-1)..(rowIndex +1)) {
        if (rowNumber in 0..<engine.size) {
            for(columnNumber in (foundNumberInfo["start"]!! -1)..(foundNumberInfo["end"]!! +1)) {
                if (columnNumber in 0..<engine[0].length) {
                    if (!engine[rowNumber][columnNumber].isDigit() && engine[rowNumber][columnNumber] != '.') {
                        return true;
                    }
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
12.34.....
..*....*..
..........
..........
...526.912
......*...
..........
..........
..........
..........
    """.trimIndent()

    // Split the multiline string into an array of strings
    val stringArray = multilineString.split("\n").toTypedArray()

    return stringArray
}