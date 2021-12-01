fun main() {
    fun part1(input: List<String>): Int {
        val n = input.size
        val depths = input.map { it.toInt() }
        var count = 0
        for (i in 0 until n - 1) {
            if (depths[i + 1] > depths[i]) {
                count++
            }
        }
        return count
    }

    fun part2(input: List<String>): Int {
        val windowSize = 3
        val depths = input.map { it.toInt() }

        return depths.windowed(windowSize) { it.sum() }
            .zipWithNext()
            .count { (prev, next) -> next > prev }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
