package practice.warmup_1

/**
 * Created by dladukedev on 5/23/2017
 */

val cutoffValue = 21

fun diff21(n: Int) : Int {
    val absoluteDifference = n.absoluteDifference(cutoffValue)
    return if(n > cutoffValue) absoluteDifference * 2 else absoluteDifference
}

fun Int.absoluteDifference(other: Int): Int {
    return Math.abs(this - other)
}