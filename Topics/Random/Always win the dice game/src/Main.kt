import kotlin.random.Random

fun createDiceGameRandomizer(n: Int): Int {
    var seed = 1
    var resultOfFriend = 0
    var resultOfOur = 0

    do {
        val generator = Random(seed)
        repeat(n) {
            resultOfFriend += generator.nextInt(1, 7)
        }
        repeat(n) {
            resultOfOur += generator.nextInt(1, 7)
        }
        seed++
    } while (resultOfFriend > resultOfOur)

    return seed - 1
}