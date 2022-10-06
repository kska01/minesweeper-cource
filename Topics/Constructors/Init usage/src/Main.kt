const val MIN = -128
const val MAX = 127

fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

data class ByteTimer(var time: Int) {
    init {
        when {
            time < MIN -> time = MIN
            time > MAX -> time = MAX
            else -> time
        }
    }
}