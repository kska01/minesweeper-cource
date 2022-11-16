fun main() {
    val input = MutableList(readln().toInt()) { readln().toInt() }
    val listOfCount = mutableListOf<Int>()
    var count = 1

    for (i in 0 until input.size - 1) {
        if (input[i] <= input[i + 1]) {
            ++count
        } else {
            listOfCount.add(count)
            count = 1
        }
    }
    listOfCount.add(count)
    println(listOfCount.maxOrNull())
}