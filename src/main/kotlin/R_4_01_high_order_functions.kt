fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
//    Taking Functions as Parameters
    return operation(x, y)
} // A higher-order function is a function that takes another function as parameter and/or returns a function.

fun sum_(x: Int, y: Int) = x + y

// returning functions
fun operation(): (Int) -> Int { // represents the parameters and return type of the square function.
    return ::square
}

fun square(x: Int): Int = x * x

fun main() {
    val sumResult = calculate(4, 5, ::sum_)
    val mulResult = calculate(4, 5) { a, b -> a * b }

    println("sumResult: $sumResult, mulResult: $mulResult")

    val func = operation()
    println("the square of 8: ${func(8)}")

    val items = listOf(1, 21, 31, 41, 51, 61)
    items.fold(0) { acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + 1
        println("result = $result")
        result
    }

    val joinedToString = items.fold("Element: ", { acc, i -> "$acc $i" })
    println(joinedToString)
}

fun <T, R> Collection<T>.fold(initial: R, combine: (acc: R, nextElement: T) -> R): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}