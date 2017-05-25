package practice.warmup_1

/**
 * Created by dladukedev on 5/23/2017
 */

fun nearHundred(n: Int) : Boolean {
    val x = Math.abs(n % 100)
    return x <= 10 || x >= 90
}