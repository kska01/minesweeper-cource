fun main() {
    val list = List(readln().toInt()) { readln().toInt() }

    println(list.minOrNull())
}