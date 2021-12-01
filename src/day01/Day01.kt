package day01

class Day01 {
    fun part1(input: List<String>): Int {
        val depths = input.map { it.toInt() }

        return depths.zipWithNext()
            .count { (prev, next) -> next > prev }
    }

    fun part2(input: List<String>): Int {
        val windowSize = 3
        val depths = input.map { it.toInt() }

        return depths.windowed(windowSize) { it.sum() }
            .zipWithNext()
            .count { (prev, next) -> next > prev }
    }
}

