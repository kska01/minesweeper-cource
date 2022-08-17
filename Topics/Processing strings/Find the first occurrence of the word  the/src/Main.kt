fun main() {
    val input = readln()
    if (input.contains("the", true)) {
        println(input.indexOf("the", 0, true))
    } else {
        println(-1)
    }
}