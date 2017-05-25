package tests.warmup_1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import practice.warmup_1.diff21

/**
 * Created by dladukedev on 5/23/2017
 */

class diff21_tests {
    @Test
    fun checkEqualTo21() {
        assertEquals(diff21(21), 0)
    }

    @Test
    fun checkGreaterThan21() {
        assertEquals(diff21(27), 12)
    }

    @Test
    fun checkLessThan21() {
        assertEquals(diff21(15), 6)
    }
}