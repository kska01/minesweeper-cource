import kotlin.random.Random

fun generatePredictablePassword(seed: Int): String {
    var randomPassword = ""
    val generator = Random(seed)
    repeat(10) {
        randomPassword += generator.nextInt(33, 127).toChar().toString()
    }
    return randomPassword
}