# Day 01

This directory contains the Kotlin solution and input data for Day 01 of Advent of Code 2023.

## Instructions

1. Implement your solution in `Solution.kt`.
2. Build and run your solution using the provided Makefile target:

   ```
   make run01
   ```

Happy coding!

## Solution

First part was very straightforward: parse the strings looking for the first and the last digit. I should have been less lazy and build a second function to find a digit from right to left, instead of parsing the whole string and taking the last digit found, because it would have helped me for the second part.

Anyway, I think it was tricky to think about finding the digits in text from right to left. Thinking on the reading direction of the spelled digits, I would have never thought to find from right to left a word that is read from left to right. I liked the trick and how they played with language tho, but using other targets to look for, instead of words... would be less tricky