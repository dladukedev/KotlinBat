package tests.warmup_1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import practice.warmup_1.nearHundred

/**
 * Created by dladukedev on 5/23/2017
 */

class nearHundred_tests {
    @Test
    fun isNearMultiHundred() {
        Assertions.assertTrue(nearHundred(395))
    }

    @Test
    fun isNotNearMultiHundred() {
        Assertions.assertFalse(nearHundred(215))
    }

    @Test
    fun isNearHundredLessThan() {
        Assertions.assertTrue(nearHundred(90))
    }

    @Test
    fun isNotNearHundredLessThan() {
        Assertions.assertFalse(nearHundred(89))
    }

    @Test
    fun isNearHundredGreaterThan() {
        Assertions.assertTrue(nearHundred(110))
    }

    @Test
    fun isNotNearHundredGreaterThan() {
        Assertions.assertFalse(nearHundred(111))
    }

}