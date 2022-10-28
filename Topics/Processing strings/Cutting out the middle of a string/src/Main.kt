fun main() {
    val str = readln()
    val index = str.length / 2
    println(
        if (str.length % 2 == 0) {
            str.removeRange(index - 1, index + 1)
        } else {
            str.removeRange(index, index + 1)
        }
    )
}