package day03

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import readInput

internal class Day03Test {

    private val day03 = Day03()
    private val testInput = readInput("Day03_test")

    @Test
    fun part1Test() {
        assertEquals(198, day03.part1(testInput))
    }

    @Test
    fun part2Test() {
        assertEquals(230, day03.part2(testInput))
    }
}