fun main() {
    val input = readln()
    val num = readln().toInt()
    var result = input[num - 1]

    println("Symbol # $num of the string \"$input\" is '$result'")
}