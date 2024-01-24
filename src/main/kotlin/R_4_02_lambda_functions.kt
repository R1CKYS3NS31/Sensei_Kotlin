/* return from function */
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun main() {
    val upperCase1: (String) -> String = { str: String -> str.toUpperCase() }
    val upperCase2: (String) -> String = { str -> str.toUpperCase() }
    val upperCase3 = { str: String -> str.toUpperCase() }
//    val upperCase4 = {str->str.toUpperCase()}
    val upperCase5: (String) -> String = { it.toUpperCase() }
    val upperCase6: (String) -> String = String::toUpperCase

    println(upperCase1("sensei"))
    println(upperCase2("sensei"))
    println(upperCase3("sensei"))
//    println(upperCase4("sensei"))
    println(upperCase5("sensei"))
    println(upperCase6("sensei"))
    println({ string: String -> string.capitalize() }("ricky sensei"))

    val timeInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minutes")
    val totalTimeInSeconds = timeInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")

    println(listOf(1, 2, 3).fold(0) { x, item ->
        x + item
    })
}