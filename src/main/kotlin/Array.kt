fun main() {
    val simpleArray = arrayOf(1, 2, 3, 2)
    val twoArray = Array(2) { Array<Int>(2) { 0 } }

    val pairArray = arrayOf("apple" to 120, "banana" to 150, "cherry" to 90, "apple" to 140)
    val intArray = IntArray(5)

    simpleArray[0] = 10
    twoArray[0][0] = 2

    println(simpleArray[0].toString())
    println(twoArray[0][0])
    println(simpleArray.sum())
    simpleArray.shuffle()
    println(simpleArray.joinToString())
    println(simpleArray.toSet())
    println(simpleArray.toList())

    println(pairArray.joinToString())
    println(pairArray.toMap())
    println(intArray.joinToString())
}
