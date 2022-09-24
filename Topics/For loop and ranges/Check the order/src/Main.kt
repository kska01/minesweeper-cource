fun main() {
    val list = List(readln().toInt()) { readln().toInt() }
    val ascendingList = list.sorted()
    println(if (list == ascendingList) "YES" else "NO")
}