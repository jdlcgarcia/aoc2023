# Advent of Code 2023 in Kotlin

![Advent of Code Banner](advent_of_code_banner.png)

Welcome to my Advent of Code 2023 Kotlin repository! This repository contains my Kotlin solutions for the challenges presented in the Advent of Code event for the year 2023.

## About Advent of Code

Advent of Code is an annual coding event that takes place in December. Each day, starting from December 1st to December 25th, a new programming challenge is released. The challenges cover a variety of algorithms and data structures, and participants are encouraged to solve them using their programming language of choice.

For more information and to participate in Advent of Code, visit [Advent of Code](https://adventofcode.com/).

## Folder Structure

- Each day's challenge has its own Kotlin package named `dayN` where N is the day number.
- Inside each day's package, you'll find the input data (`input.txt`) and the Kotlin source code (`Solution.kt`).

## Running the Solutions

1. Navigate to the day's Kotlin package you want to explore.
2. Review the `README.md` file within each day's package for specific details about the challenge.
3. Run the solution code using Kotlin's standard tools or your preferred IDE.

```bash
kotlinc Solution.kt -include-runtime -d Solution.jar
java -jar Solution.jar
