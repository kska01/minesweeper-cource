import kotlin.math.sqrt

const val PI = 3.14

fun main() {
    var area = 0.0
    when (readln()) {
        "triangle" -> {
            val lengthOfSides = List("3".toInt()) { readln().toDouble() }
            val halfOfSumOfSides = (lengthOfSides[0] + lengthOfSides[1] + lengthOfSides[2]) / 2
            +(lengthOfSides[0] + lengthOfSides[1] + lengthOfSides[2]) % 2
            area = sqrt(
                halfOfSumOfSides * (halfOfSumOfSides - lengthOfSides[0]) * (halfOfSumOfSides - lengthOfSides[1]) *
                    (halfOfSumOfSides - lengthOfSides[2])
            )
        }
        "rectangle" -> {
            val lengthOfSides = List(2) { readln().toDouble() }
            area = lengthOfSides[0] * lengthOfSides[1]
        }
        "circle" -> {
            val radius = readln().toDouble()
            area = radius * radius * PI
        }
    }

    println(area)
}