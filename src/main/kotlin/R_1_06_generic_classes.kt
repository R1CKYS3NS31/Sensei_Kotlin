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