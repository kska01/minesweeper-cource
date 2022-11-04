fun main() {
    println(checkSpeed(readln().toInt(), readln()))
}

fun checkSpeed(speed: Int, _limit: String = "60"): String {
    val limit = if (_limit == "no limit") "60".toInt() else _limit.toInt()

    return if (speed > limit) {
        "Exceeds the limit by ${speed - limit} kilometers per hour"
    } else "Within the limit"
}