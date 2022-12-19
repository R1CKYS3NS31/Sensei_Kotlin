// The partition function splits the original collection into a pair of lists using a given predicate
fun main(){
    val numbers = listOf(1,-2,3,-4,5,-6)

    val evenOdd = numbers.partition { it%2==0 } // split numbers into a pair of even && odd list
    val (positives, negatives ) = numbers.partition { it>0 }

    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")
    println("Odd numbers: ${evenOdd.second}")
    println("Positives numbers: $positives")
    println("Negative numbers: $negatives")
}