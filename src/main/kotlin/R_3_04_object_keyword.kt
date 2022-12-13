import kotlin.random.Random

class LuckyDispatcher { // blueprint of an object
    fun getNumber() {
        val objRandom = Random
        println(objRandom.nextInt(90))
    }
}
fun main() {
    val d1 = LuckyDispatcher() // instance of a class
    val d2 = LuckyDispatcher()

    d1.getNumber() // calls method of a class
    d2.getNumber()
}