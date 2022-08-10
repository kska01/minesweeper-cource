import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        var needMoney = 0
        val payment = scanner.nextInt()
        if (balance >= payment) {
            balance -= payment
        } else {
            needMoney = payment
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $needMoney.")
            return
        }
    }
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}