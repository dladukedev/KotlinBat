package practice.warmup_1

/**
 * Created by dladukedev on 5/25/2017
 */

fun posNeg(a: Int, b: Int, negative: Boolean) : Boolean = if(negative) a < 0 && b < 0 else a * b < 0