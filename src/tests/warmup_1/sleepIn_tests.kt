package tests.warmup_1

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import practice.warmup_1.sleepIn

/**
 * Created by dladukedev on 5/23/2017
 */

class sleepIn_tests {
    @Test
    fun isWeekdayAndVacation() {
        assert(sleepIn(true, true))
    }

    @Test
    fun isNotWeekdayAndVacation() {
        assert(sleepIn(false, true))
    }

    @Test
    fun isWeekdayAndNotVacation() {
        assertFalse(sleepIn(true, false))
    }

    @Test
    fun isNotWeekdayAndNotVacation() {
        assert(sleepIn(false, false))
    }
}