package tests.warmup_1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import practice.warmup_1.makes10

/**
 * Created by dladukedev on 5/23/2017
 */

class makes10_tests {
    @Test
    fun leftIsTen() {
        assertTrue(makes10(10, 9))
    }

    @Test
    fun rightIsTen() {
        assertTrue(makes10(9, 10))
    }

    @Test
    fun sumIsTen() {
        assertTrue(makes10(1, 9))
    }

    @Test
    fun sumIsNotTen() {
        assertFalse(makes10(9, 9))
    }
}