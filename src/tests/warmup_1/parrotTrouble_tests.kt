package tests.warmup_1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import practice.warmup_1.endSafeHours
import practice.warmup_1.parrotTrouble
import practice.warmup_1.startSafeHours

/**
 * Created by laduke on 5/23/2017.
 * Copyright apdev
 */

class parrotTrouble_tests {
    @Test
    fun parrotTalkingBeforeStartHour() {
        val time = startSafeHours - 1
        assertTrue(parrotTrouble(true, time))
    }

    @Test
    fun parrotTalkingAfterEndHour() {
        val time = endSafeHours + 1
        assertTrue(parrotTrouble(true, time))
    }

    @Test
    fun parrotTalkingDuringSafeTime() {
        val time = startSafeHours + 1
        assertFalse(parrotTrouble(true, time))
    }

    @Test
    fun parrotNotTalkingBeforeStartHour() {
        val time = startSafeHours - 1
        assertFalse(parrotTrouble(false, time))
    }

    @Test
    fun parrotNotTalkingAfterEndHour() {
        val time = endSafeHours + 1
        assertFalse(parrotTrouble(false, time))
    }

    @Test
    fun parrotNotTalkingDuringSafeTime() {
        val time = startSafeHours + 1
        assertFalse(parrotTrouble(false, time))
    }
}