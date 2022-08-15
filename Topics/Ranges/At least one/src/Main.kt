fun main() {
    val range1 = readln().toInt()..readln().toInt()
    val range2 = readln().toInt()..readln().toInt()
    val input = readln().toInt()
    println(input in range1 || input in range2)
}