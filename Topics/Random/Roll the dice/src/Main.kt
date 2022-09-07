import kotlin.random.Random

const val MAX = 7

fun throwD6(): Int {
    val numberOnTheDice = Random.nextInt(1, MAX)
    return numberOnTheDice
}