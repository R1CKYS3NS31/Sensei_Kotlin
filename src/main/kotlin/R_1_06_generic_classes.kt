class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)

    //    fun pop():E =elements.removeLast() //or
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "MutableStack(${elements.joinToString("...")})" // overrides the toSting() on println()
}

fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7) // decimals is the inferred type
    stack.push(9.87)
    println(stack)

    println("print last element 'peek()' : ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("remove last element 'pop()' : ${stack.pop()}")
        println(stack)
    }
}

interface Source<out T> {
    fun nextT(): T
}

fun outdemo(strs: Source<String>) {
    val objects: Source<Any> = strs // This is OK, since T is an out-parameter
}

// variance
//interface Comparable<in T> {
//    /* complementary variance annotation: in. It makes a type parameter contravariant,
//     *meaning it can only be consumed and never produced (opposite to out)
//     **/
//    operator fun compareTo(other: T): Int
//}
//
//fun indemo(x: Comparable<Number>) {
//    x.compareTo(1.0)// 1.0 has type Double, which is a subtype of Number
//    // Thus, you can assign x to a variable of type Comparable<Double>
//    val y: Comparable<Double> = x // OK!
////    val z: Comparable<String> = x // Error!
//}

/* start projections */
/*
* Function<*, String> means Function<in Nothing, String>.
* Function<Int, *> means Function<Int, out Any?>.
* Function<*, *> means Function<in Nothing, out Any?>.
* */