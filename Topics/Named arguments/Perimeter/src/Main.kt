import kotlin.math.hypot

fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double = x1,
    y4: Double = y1
): Double {
    val side = mutableListOf<Double>()
    side += hypot(x1 - x2, y1 - y2)
    side += hypot(x2 - x3, y2 - y3)
    side += hypot(x3 - x4, y3 - y4)
    side += hypot(x1 - x4, y1 - y4)
    return side.sum()
}