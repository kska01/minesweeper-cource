fun main() {
    val upTo = readln().toInt()
    var num = 1
    while (num * num <= upTo) {
        println(num * num)
        num++
    }
}