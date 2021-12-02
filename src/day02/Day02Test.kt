package day02

import day01.Day01
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import readInput

internal class Day02Test {

    private val day02 = Day02()
    private val testInput = readInput("Day02_test")

    @Test
    fun part1Test() {
        assertEquals(150, day02.part1(testInput))
    }

    @Test
    fun part2Test() {
        assertEquals(900, day02.part2(testInput))
    }
}