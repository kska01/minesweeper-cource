fun main() {
    val string = readln()
    val index = string.indexOfLast { it == 'u' } + 1
    var result = ""
    result = string.substring(0, index)
    result += string.substring(index).uppercase()
    println(result)
}