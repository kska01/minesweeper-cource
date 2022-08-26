fun main() {
    val input = readln()
    val vowels = "aeiouy"
    var inputToDigit = ""
    var count1 = 1
    var count2 = 1
    var result = 0
    var total = 0

    for (ch in input) {
        inputToDigit += if (ch in vowels) "0" else "1"
    }

    for (ch in inputToDigit) {
        total += ch.toString().toInt()
    }

    if (total == 0 || total == inputToDigit.length) {
        println(
            if (inputToDigit.length % 2 == 0) {
                inputToDigit.length / 2 - 1
            } else {
                inputToDigit.length / 2
            }
        )
        return
    }

    if (inputToDigit.contains("000")) {
        for (i in 0 until inputToDigit.lastIndex) {
            if (inputToDigit[i] == '0' && inputToDigit[i] == inputToDigit[i + 1]) {
                count1 += 1
            } else {
                if (count1 >= 3) {
                    result += if (count1 % 2 == 0) {
                        count1 / 2 - 1
                    } else {
                        count1 / 2
                    }
                }
            }
        }
    }

    if (inputToDigit.contains("111")) {
        for (i in 0 until inputToDigit.lastIndex) {
            if (inputToDigit[i] == '1' && inputToDigit[i] == inputToDigit[i + 1]) {
                count2 += 1
            } else {
                if (count2 >= 3) {
                    result += if (count2 % 2 == 0) {
                        count2 / 2 - 1
                    } else {
                        count2 / 2
                    }
                }
            }
        }
    }
    println(
        if (result == 0) 0 else result
    )
}