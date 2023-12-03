# Day 03

This directory contains the Kotlin solution and input data for Day 03 of Advent of Code 2023.

## Instructions

1. Implement your solution in `Solution.kt`.
2. Build and run your solution using the provided Makefile target:

   ```
   make run03
   ```

Happy coding!

## Solution

This first part went wild! Reading the second part I think I did a bad approach... I parsed the numbers and, when I had a complete number, I checked the surrounding cells to see if there was a character other than a dot or a digit. Maybe I should have searched for symbols and then find the number surrounding them... so probably I will make that for the second part.

Loved the recursive solution to find the first character of the number! A quién no le va a gustá una función recursiva de las que se dan en primero? It's been a little bit hacky, ngl, but having the frustration of making the opposite approach on the first part, it's more than good enough for me