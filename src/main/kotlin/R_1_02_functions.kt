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
}