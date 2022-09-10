fun main() {
    val input = readln()
    var first = 0
    var second = 0
    for (i in 0 until input.length / 2) {
        first += input[i].toString().toInt()
        second += input[i + input.length / 2].toString().toInt()
    }
    println(if (first == second) "YES" else "NO")
}