import java.io.File

fun main() {
    println("hello world")
    val files = File("./src/main/kotlin").listFiles()
    println("number of files in this directory: ${files?.size}")//if not null shorthand
    println(files?.size ?: "empty")//if not null else shorthand
    var a = 1
    var b = 3
    println("before swap: $a and $b")
    a = b.also { b = a }
    println("after swap: $a and $b")

    /* kotlin ref */
    var customers = 10
    customers = customers + 3 // Example of addition: 11
    customers += 7 // Example of addition: 18
    customers -= 3 // Example of subtraction: 15
    customers *= 2 // Example of multiplication: 30
    customers /= 3 // Example of division: 10
    println(customers) // 10
}
