package tests.warmup_1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import practice.warmup_1.posNeg

/**
 * Created by dladukedev on 5/25/2017
 */

class posNeg_tests {
    @Test
    fun BothNegativeAndNegativeIsTrue() {
        Assertions.assertTrue(posNeg(-1, -1, true))
    }

    @Test
    fun BothNegativeAndNotNegativeIsFalse() {
        Assertions.assertFalse(posNeg(-1, -1, false))
    }

    @Test
    fun BothPositiveAndNegativeIsFalse() {
        Assertions.assertFalse(posNeg(1, 1, true))
    }

    @Test
    fun BothPositiveAndNotNegativeIsFalse() {
        Assertions.assertFalse(posNeg(1, 1, false))
    }

    @Test
    fun OneNegativeOnePositiveAndNegativeIsFalse() {
        Assertions.assertFalse(posNeg(-1, 1, true))
        Assertions.assertFalse(posNeg(1, -1, true))
    }

    @Test
    fun OneNegativeOnePositiveAndNotNegativeIsTrue() {
        Assertions.assertTrue(posNeg(1, -1, false))
        Assertions.assertTrue(posNeg(-1, 1, false))
    }
}