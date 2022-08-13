const val FOUR = 4

fun main() {
    var str = ""
    repeat(FOUR) {
        str += readln()
    }
    val list = str.toCharArray()
    for (ch in list) {
        println(ch - 1)
    }
}