fun main() {
    val (num1, operator, num2) = readln().split(" ")
    val n1 = num1.toLong()
    val n2 = num2.toLong()
    println(
        if (n2 == 0L && operator == "/") {
            "Division by 0!"
        } else {
            when (operator) {
                "+" -> n1 + n2
                "-" -> n1 - n2
                "*" -> n1 * n2
                "/" -> n1 / n2
                else -> "Unknown operator"
            }
        }
    )
}