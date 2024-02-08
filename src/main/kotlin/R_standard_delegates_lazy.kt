import kotlin.properties.Delegates

val lazyValue: String by lazy {
    println("computed") // called only on first instance
    "Hello"
}

/* observable property with delegate*/
class Guy {
    /* */
    var name: String by Delegates.observable("no name") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main() {
    println("first instance: $lazyValue")
    println("second instance: $lazyValue") // Subsequent calls to get() simply return the remembered result.

    val guy = Guy()
    guy.name = "first"
    guy.name = "second"
}