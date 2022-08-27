const val THREE = 3

fun stringToDigit(string: String): String {
    val vowels = "aeiouy"
    var stringToDigit = ""
    for (ch in string) {
        stringToDigit += if (ch in vowels) "0" else "1"
    }
    return stringToDigit
}

fun isOneLetter(digitsOfString: String): Boolean {
    var total = 0
    var result = false

    for (ch in digitsOfString) {
        total += ch.toString().toInt()
    }

    if (total == 0 || total == digitsOfString.length) {
        println(
            if (digitsOfString.length % 2 == 0) {
                digitsOfString.length / 2 - 1
            } else {
                digitsOfString.length / 2
            }
        )
        result = true
    }

    return result
}

fun countVowels(digitsOfString: String): Int {
    var count = 1
    var result = 0

    for (i in 0 until digitsOfString.lastIndex) {
        if (digitsOfString[i] == '0' && digitsOfString[i] == digitsOfString[i + 1]) {
            count += 1
        } else {
            if (count >= THREE) {
                result += if (count % 2 == 0) {
                    count / 2 - 1
                } else {
                    count / 2
                }
            }
            count = 1
        }
    }
    if (count >= THREE) {
        result += if (count % 2 == 0) {
            count / 2 - 1
        } else {
            count / 2
        }
    }

    return result
}

fun countConsonants(digitsOfString: String): Int {
    var count = 1
    var result = 0

    for (i in 0 until digitsOfString.lastIndex) {
        if (digitsOfString[i] == '1' && digitsOfString[i] == digitsOfString[i + 1]) {
            count += 1
        } else {
            if (count >= THREE) {
                result += if (count % 2 == 0) {
                    count / 2 - 1
                } else {
                    count / 2
                }
            }
            count = 1
        }
    }
    if (count >= THREE) {
        result += if (count % 2 == 0) {
            count / 2 - 1
        } else {
            count / 2
        }
    }

    return result
}

fun main() {
    val input = readln()
    var digitsOfString = ""
    var result = 0

    digitsOfString = stringToDigit(input)

    if (isOneLetter(digitsOfString)) return

    if (digitsOfString.contains("000")) result += countVowels(digitsOfString)
    if (digitsOfString.contains("111")) result += countConsonants(digitsOfString)

    println(
        if (result == 0) 0 else result
    )
}

