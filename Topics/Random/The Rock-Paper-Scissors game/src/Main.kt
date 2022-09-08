import kotlin.random.Random

const val MAX = 4

fun makeDecision(): String {
    return when (Random.nextInt(1, MAX)) {
        1 -> "Rock"
        2 -> "Paper"
        else -> "Scissors"
    }
}