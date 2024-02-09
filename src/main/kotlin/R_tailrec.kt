import kotlin.math.abs
import kotlin.math.cos

const val EPS: Double = 1E-10

tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (abs(x - cos(x)) < EPS) x else findFixPoint(cos(x))

/* instead of */
//private fun fixedPoint(): Double {
//    var x = 1.0
//    while (true) {
//        val y = cos(x)
//        if (cos(x - y) < EPS) return x
//        x = cos(x)
//    }
//}
fun main() {
    println(findFixPoint())
//    println(fixedPoint())
}