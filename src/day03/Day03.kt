package day03

import java.io.File

class Day03 {

    fun part1(input: List<String>): Int {
        val length = input[0].indices
        var gamma = ""
        length.forEach {
            gamma += commonBit(input, it)
        }

        var epsilon = ""
        gamma.forEach { epsilon += if (it == '0') '1' else '0' }

        return gamma.toInt(2) * epsilon.toInt(2)
    }

    fun part2(input: List<String>): Int {
        return getRating(input, Rating.OXYGEN).toInt(2) * getRating(input, Rating.C02).toInt(2)
    }
}

private fun getRating(input: List<String>, type: Rating): String {
    val length = input[0].indices
    var remainingInput = input
    for (index in length) {
        val bit = commonBit(input, index)
        remainingInput = remainingInput.filter {
            when (type) {
                Rating.OXYGEN -> it[index] == bit
                Rating.C02 -> it[index] != bit
            }
        }
        if (remainingInput.size == 1) break
    }
    return remainingInput.single()
}

private enum class Rating {
    OXYGEN, C02
}

private fun commonBit(input: List<String>, index: Int): Char {
    var zeroes = 0
    var ones = 0
    for (line in input) {
        if (line[index] == '0') zeroes++
        else ones++
    }
    return if (zeroes > ones) '0' else '1'
}
