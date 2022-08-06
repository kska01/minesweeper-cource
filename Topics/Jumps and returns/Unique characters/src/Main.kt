fun main() {
    val input = readln()
    var onlyOneLetter = 0

    for (ch1 in input) {
        var count = 0
        for (ch2 in input) {
            if (ch1 == ch2) ++count
            if (count == 2) break
        }
        if (count == 1) onlyOneLetter++
    }

    println(onlyOneLetter)
}