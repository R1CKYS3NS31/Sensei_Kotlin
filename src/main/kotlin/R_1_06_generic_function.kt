fun <E> mutableDecimals(vararg elements: E) = mutableSetOf(*elements) //E is any-letter generic type parameter

/* generic constraints */
fun <T : Comparable<T>> sort(list: List<T>) {
    return println(list)
}

fun main() {
    val stack = mutableDecimals(0.45, 45.34, 5.3) //inferred 'any-type' generic parameter
    println("generic type decimal parameter: $stack")

    val colors = listOf("Red", "Blue", "Green")
    sort(colors)
//    sort(listOf(HashMap<Int, String>())) // Error: HashMap<Int, String> is not a subtype of Comparable<HashMap<Int, String>>
}

