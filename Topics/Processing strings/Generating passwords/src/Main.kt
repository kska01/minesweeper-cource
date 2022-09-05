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

fun check(str: String): String {
    for (i in 0 until str.lastIndex) {
        if (str[i] == str[i + 1])
    }
}

fun main() {
    val (a, b, c, d) = readln().split(' ').map { it.toInt() }
    var passwords = ""
    var uppercase = ""
    var lowercase = ""
    var digits = ""

    if ((a + b + c + d) == 0 ) {
        println()
        return
    }

    
    uppercase += uppercase(a)
    lowercase += lowercase(b)
    digits += digits(c)

    if ((a + b + c) < d) {
        passwords += remainder(d - (a + b + c))
    }

}