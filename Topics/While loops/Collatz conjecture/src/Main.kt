const val THREE = 3

fun main() {
    var num = readln().toInt()
    while (num != 1) {
        print("$num ")
        if (num % 2 == 0) {
            num /= 2
        } else {
            num = num * THREE + 1
        }
    }
    print(num)
}