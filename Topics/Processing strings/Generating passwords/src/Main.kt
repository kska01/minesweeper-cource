import java.lang.Math.random

fun uppercase(num: Int): String {
    val letter = 'A'..'Z'
    var result = ""
    repeat(num) {
        result += letter.random()
    }
    return result
}

fun lowercase(num: Int): String {
    val letter = 'a'..'z'
    var result = ""
    repeat(num) {
        result += letter.random()
    }
    return result
}

fun digits(num: Int): String {
    val digits = '0'..'9'
    var result = ""
    repeat(num) {
        result += digits.random()
    }
    return result
}

fun remainder(num: Int): String {
    val letter = 'A'..'z'
    var result = ""
    repeat(num) {
        result += letter.random()
    }
    return result
}

fun check(password: List<Char>): Boolean {
    var flag = true
    for (i in 0 until password.lastIndex) {
        if (password[i] == password[i + 1]) flag = false
    }
    return flag
}

fun main() {
    val (a, b, c, d) = readln().split(' ').map { it.toInt() }
    var letters = ""

    if (a + b + c + d == 0) {
        println()
        return
    }

    letters += uppercase(a)
    letters += lowercase(b)
    letters += digits(c)

    if (a + b + c < d) {
        letters += remainder(d - (a + b + c))
    }

    var password = letters.toList().shuffled()

    while (!check(password)) {
        password = password.shuffled()
    }

    println(password.joinToString(""))
}