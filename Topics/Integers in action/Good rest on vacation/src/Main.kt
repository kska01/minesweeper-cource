const val TWO = 2
const val THREE = 3
const val FOUR = 4

fun main() {
    val list = MutableList(FOUR) { readln().toInt() }
    println(list[0] * list[1] + list[TWO] * TWO + list[THREE] * (list[0] - 1))
}