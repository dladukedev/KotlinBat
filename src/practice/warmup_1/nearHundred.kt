package practice.warmup_1

/**
 * Created by laduke on 5/23/2017.
 * Copyright apdev
 */

fun nearHundred(n: Int) : Boolean {
    val x = Math.abs(n % 100)
    return x <= 10 || x >= 90
}