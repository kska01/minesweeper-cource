fun main() {
    val list = MutableList(readln().toInt()) { readln() }
    val last = list.last()
    list.removeAt(list.lastIndex)
    list.add(0, last)
    println(list.joinToString(" "))
}