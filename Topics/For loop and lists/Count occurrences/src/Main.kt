fun main() {
    val list = List(readln().toInt()) { readln() }
    val num = readln()
    println(list.count { it == num })
}

// fun main() {
//    var count = 0
//    val list = List(readln().toInt()) { readln() }
//    val num = readln()
//    list.filter { it == num }.forEach { _ -> count++ }
//    println(count)
// }