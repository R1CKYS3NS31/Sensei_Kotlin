fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

//    These functions return the first and the last element of the collection correspondingly.
    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }

    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")

    println("-----------------------------------------")
    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val firstE = empty.firstOrNull()
    val lastE = empty.lastOrNull()

    val firstF = empty.firstOrNull { it.startsWith('f') } // first word  starting word 'f'
    val firstZ = words.firstOrNull { it.startsWith('z') } // first word starting with 'z'
    val lastF = words.lastOrNull { it.endsWith('f') } // last word ending with 'f'
    val lastZ = words.lastOrNull { it.endsWith('z') } // last word ending with 'z'

    println("First $firstE, last $lastE")
    println("First starts with 'f' is $firstF, last starts with 'z' is $firstZ")
    println("First ends with 'f' is $lastF, last ends with 'z' is $lastZ")
}