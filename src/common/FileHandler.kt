package common

import java.nio.file.StandardOpenOption
import kotlin.io.path.Path
import kotlin.io.path.readLines
import kotlin.io.path.writeText

fun readInput(name: String) = Path("src/$name/input.txt").readLines()

fun append(day: String, name: String, line: String) = Path("src/$day/$name").writeText(
    line,
    Charsets.UTF_8,
    StandardOpenOption.CREATE,
    StandardOpenOption.APPEND
)