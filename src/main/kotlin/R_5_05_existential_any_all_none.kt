fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

//    Function any returns true if the collection contains at least one element that matches the given predicate.
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 0 }

    println("Numbers: $numbers")
    println("Is there any number less than  0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")

//    Function all returns true if all elements in collection match the given predicate.
    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }
    println("----------------------------------------------")
    println("All numbers are even numbers: $allEven")
    println("all numbers greater than 6: $allLess6")

    val noOdd_allEven = numbers.none { it % 2 == 1 }
    val noGT6 = numbers.none { it < 6 }
    println("----------------------------------------------")
    println("All numbers are even numbers: $noOdd_allEven")
    println("all numbers greater than 6: $allLess6")

}