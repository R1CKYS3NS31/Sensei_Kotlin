fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
//    filter function enables you to filter collections
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    println("Numbers: $numbers")
    println("poditive numbers: $positives")
    println("negative numbers: $negatives")
}