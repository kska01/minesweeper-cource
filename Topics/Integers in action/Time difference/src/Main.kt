const val THREE = 3
const val HOUR_TO_SECOND = 3600
const val MIN_TO_SECOND = 60

fun main() {
    val first = List(THREE) { readln().toInt() }
    val second = List(THREE) { readln().toInt() }
    val totalFirst = first[0] * HOUR_TO_SECOND + first[1] * MIN_TO_SECOND + first[2]
    val totalSecond = second[0] * HOUR_TO_SECOND + second[1] * MIN_TO_SECOND + second[2]

    println(totalSecond - totalFirst)
}