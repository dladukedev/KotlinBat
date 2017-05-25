package practice.warmup_1

/**
 * Created by dladukedev on 5/23/2017
 */

val startSafeHours = 7
val endSafeHours = 20

fun parrotTrouble(talking: Boolean, hour: Int) : Boolean = talking && (hour < startSafeHours || hour > endSafeHours)
