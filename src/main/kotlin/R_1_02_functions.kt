fun printMessage(message: String): Unit {//returns void defined by unit
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "info") {//default parameter&&omitted unit
    println("[$prefix] $message")
}

fun add(x: Int, y: Int): Int {//returns int
    return x + y
}

fun multiply(x: Int, y: Int) = x * y//returns inferred int
fun main() {
    printMessage("my name is Ricky")
    printMessageWithPrefix("I love you...")
    printMessageWithPrefix("I love you...", "Ricky")
    printMessageWithPrefix(prefix = "Sensei", message = "I got you...")
    println("the sum is ${add(56, 32)}")
    println("The multiplication is ${multiply(32, 65)}")

    nonLocalReturn()
    localReturnWithLabel()

    /* or initialize as lambda */
    val isEven = IntPredicate { it % 2 == 0 }
    println("Is 7 even? ${isEven.accept(7)}")
}

/* Single Abstract Method - SAM */
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

val isEven = object : IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}

fun nonLocalReturn() {
//    listOf(1, 2, 3, 4, 5).forEach {
//        if (it == 3) return // non-local return directly to the caller of nonLocalReturn()
//        println(it)
//    }
//    println("this point is unreachable")
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // non-local return from the lambda passed to run
            println(it)
        }
    }
    println("done with nested loop with non-local return")
}

fun localReturnWithLabel() {
//    listOf(1, 2, 3, 4, 5).forEach {
//        if (it == 3) return@forEach // or with label
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
        println(it)
    }
    println("done with explicit label with local return")
}