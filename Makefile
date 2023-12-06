# Makefile

.PHONY: all

all:
	@echo "Available targets:"
	@echo "  dayXX: Create Kotlin package for day XX"
	@echo "  runXX: Build and run Kotlin solution for day XX"

day:
	@echo "Please specify a day (e.g., 'make dayXX')"

day%:
	@mkdir -p src/day$*
	@echo "package day$*" > src/day$*/Solution.kt
	@echo "" >> src/day$*/Solution.kt
	@echo "fun main() {" >> src/day$*/Solution.kt
	@echo "    // Your solution code for day $*" >> src/day$*/Solution.kt
	@echo "}" >> src/day$*/Solution.kt
	@echo "Created Kotlin package for day $*"
	@echo "# Day $*" > src/day$*/README.md
	@echo "" >> src/day$*/README.md
	@echo "This directory contains the Kotlin solution and input data for Day $* of Advent of Code 2023." >> src/day$*/README.md
	@echo "" >> src/day$*/README.md
	@echo "## Instructions" >> src/day$*/README.md
	@echo "" >> src/day$*/README.md
	@echo "1. Implement your solution in \`Solution.kt\`." >> src/day$*/README.md
	@echo "2. Build and run your solution using the provided Makefile target:" >> src/day$*/README.md
	@echo "" >> src/day$*/README.md
	@echo "   \`\`\`" >> src/day$*/README.md
	@echo "   make run$*" >> src/day$*/README.md
	@echo "   \`\`\`" >> src/day$*/README.md
	@echo "" >> src/day$*/README.md
	@echo "Happy coding!" >> src/day$*/README.md

build:
	@echo "Please specify a day (e.g., 'make buildXX')"

build%:
	@echo "Building solution for day $*"
	@kotlinc src/common/FileHandler.kt src/day$*/*.kt -include-runtime -d src/day$*/Solution.jar
	@echo "Built Kotlin solution for day $*"

execute:
	@echo "Please specify a day (e.g., 'make executeXX')"

execute%:
	@java -jar src/day$*/Solution.jar

run:
	@echo "Please specify a day (e.g., 'make runXX')"

run%: build%
	@make execute$*
