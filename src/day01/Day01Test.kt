package day01

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import readInput

internal class Day01Test {

    private val day01 = Day01()
    private val testInput = readInput("Day01_test")

    @Test
    fun part1Test() {
        assertEquals(7, day01.part1(testInput))
    }

    @Test
    fun part2Test() {
        assertEquals(5, day01.part2(testInput))
    }
}