fun main() {
    cases("hello")
    cases(1)
    cases(0L)
    cases(MyCLass())
    cases("Hello")
}

class MyCLass

fun cases(obj: Any): Any {
//    when statement
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
//    when expression
    val result = when (obj) {
        1 -> "One"
        "hello" -> 1
        is Long -> false
        else -> 42
    }
//    default
    when{
        else -> println("default value")
    }
    return result.also (::println )
}
