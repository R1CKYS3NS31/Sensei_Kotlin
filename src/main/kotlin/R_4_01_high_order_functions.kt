fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
//    Taking Functions as Parameters
    return operation(x, y)
} // A higher-order function is a function that takes another function as parameter and/or returns a function.

fun sum_(x: Int, y: Int) = x + y

// returning functions
fun operation(): (Int) -> Int { // represents the parameters and return type of the square function.
    return ::square
}
fun square(x: Int): Int = x*x
fun main() {
    val sumResult = calculate(4, 5, ::sum_)
    val mulResult = calculate(4, 5) { a, b -> a * b }

    println("sumResult: $sumResult, mulResult: $mulResult")
    val func = operation()
    println("the square of 8: ${func(8)}")
}