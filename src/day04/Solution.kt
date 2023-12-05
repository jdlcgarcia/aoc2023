package day04

import common.readInput
import kotlin.math.pow

fun main() {
    val testInput = readInput("day04")
//    val testInput = loadTestInput()
    var sumOfPoints = 0
    var cardCounter = 0
    var repetitionKeeper: MutableMap<Int, Int> = mutableMapOf()
    var actualGamePointer = 1

    for (line in testInput) {
        if (repetitionKeeper[actualGamePointer] == null) {
            repetitionKeeper[actualGamePointer] = 1
        }
        val partialPoints = calculateScorePerRow(line)
//        println("process " + partialPoints + " points of game " + actualGamePointer)
        for (gameIndex in 1..partialPoints) {
            val index = gameIndex + actualGamePointer
            val currentValue = repetitionKeeper.getOrDefault(index, 1)
            repetitionKeeper[index] = currentValue + repetitionKeeper[actualGamePointer]!!
//            println("add 1 card in position " + index + " for each of the " + repetitionKeeper[actualGamePointer] + " cards that we have from the current game, "+repetitionKeeper[index]+" in total")
        }
        sumOfPoints += (2.0).pow(partialPoints - 1).toInt()
        actualGamePointer++
    }

    println("How many points are they worth in total?")
    println(sumOfPoints.toString())

    for(numberOfCards in repetitionKeeper.values) {
        cardCounter+=numberOfCards
    }
    println("how many total scratchcards do you end up with?")
    println(cardCounter)
}

fun calculateScorePerRow(line: String): Int {
    val basicGameLine = line.split(':')
    val gameParts = basicGameLine[1].split('|')
    var score = 0;

    var game = mutableMapOf(
        "winning" to gameParts[0].split(' ').filter { it.isNotBlank() }.map { it.toInt() },
        "selected" to gameParts[1].split(' ').filter { it.isNotBlank() }.map { it.toInt() }
    )

    for (selectedNumber in game["selected"]!!) {
        if (game["winning"]!!.indexOf(selectedNumber) > -1) {
            score++
        }
    }

    return score
}


fun loadTestInput(): Array<String> {
    val multilineString = """
Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53
Card 2: 13 32 20 16 61 | 61 30 68 82 17 32 24 19
Card 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1
Card 4: 41 92 73 84 69 | 59 84 76 51 58  5 54 83
Card 5: 87 83 26 28 32 | 88 30 70 12 93 22 82 36
Card 6: 31 18 13 56 72 | 74 77 10 23 35 67 36 11
    """.trimIndent()

    // Split the multiline string into an array of strings
    val stringArray = multilineString.split("\n").toTypedArray()

    return stringArray
}