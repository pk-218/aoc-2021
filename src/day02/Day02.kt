package day02

class Day02 {
    fun part1(input: List<String>): Int {
        val n = input.size
        var horizontalDistance = 0
        var depth = 0

        for (i in 0 until n) {
            val str = input[i].split(" ")
            val x = str[1].toInt()
            when (str[0]) {
                "forward" -> horizontalDistance += x
                "up" -> depth -= x
                "down" -> depth += x
            }
        }
        return horizontalDistance * depth
    }

    fun part2(input: List<String>): Int {
        val n = input.size
        var horizontalDistance = 0
        var depth = 0
        var aim = 0

        for (i in 0 until n) {
            val str = input[i].split(" ")
            val x = str[1].toInt()
            when (str[0]) {
                "forward" -> {
                    horizontalDistance += x
                    depth += aim * x
                }
                "up" -> aim -= x
                "down" -> aim += x
            }
        }
        return horizontalDistance * depth
    }
}