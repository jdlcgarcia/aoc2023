package day02

import common.readInput
import kotlin.math.min

data class Game(val gameNumber: Int, val possible: Boolean, val power: Int)

fun main() {
    val testInput = readInput("day02")
//    val testInput = loadTestInput()
    val limitations = mapOf(
        "red" to 12,
        "green" to 13,
        "blue" to 14
    )

    val games: MutableList<Game> = mutableListOf()

    var sumOfPossibleGames: Int = 0
    var sumOfPowers: Int = 0

    for (line in testInput) {
        val game = parseGame(line, limitations)
        sumOfPowers += game.power
        games.add(game)
        if (game.possible) {
            sumOfPossibleGames += game.gameNumber
        }
    }

    println("What is the sum of the IDs of those games?")
    println(sumOfPossibleGames.toString())
    println("What is the sum of the power of these sets?")
    println(sumOfPowers.toString())
}

fun parseGame(line: String, limitations: Map<String, Int>): Game {
    val minimumCubes = mutableMapOf(
        "red" to 0,
        "green" to 0,
        "blue" to 0
    )
    val basicGameLine = line.split(':')
    val gameDescription = basicGameLine[0].split(' ')

    val gameTries = basicGameLine[1].split(';')
    var possibleGame = true
    for (gameTry in gameTries) {
        val colorMap = mutableMapOf<String, Int>()
        val extractions = gameTry.split(',')
        for (singleColorExtraction in extractions) {
            val parts = singleColorExtraction.trim().split(" ")
            if (parts.size == 2) {
                val count = parts[0].toIntOrNull()
                val color = parts[1]
                if (count != null) {
                    colorMap[color] = count
                    if (minimumCubes[color]!! < count) {
                        minimumCubes[color] = count
                    }
                }
            }
        }
        if (possibleGame) {
            possibleGame = checkGameViability(colorMap, limitations)
        }
    }

    return Game(gameDescription[1].toInt(), possibleGame, calculatePower(minimumCubes))
}

fun calculatePower(minimumCubes: MutableMap<String, Int>): Int {
    return minimumCubes.values.reduce { acc, value -> acc * value }
}

fun checkGameViability(colorMap: MutableMap<String, Int>, limitations: Map<String, Int>): Boolean {
    for ((color, extractedUnits) in colorMap) {
        val limitationOnColor = limitations[color]
        if (limitationOnColor == null || extractedUnits > limitationOnColor) {
            return false
        }
    }

    return true
}

fun loadTestInput(): Array<String> {
    val multilineString = """
Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
    """.trimIndent()

    // Split the multiline string into an array of strings
    val stringArray = multilineString.split("\n").toTypedArray()

    return stringArray
}
