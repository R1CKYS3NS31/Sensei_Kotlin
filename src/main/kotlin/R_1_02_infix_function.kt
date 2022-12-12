fun main() {
    infix fun Int.times(str: String) = str.repeat(this)//define infix func on int
    //times()-'*' is an operator function
    println(5 times "bye ")//calls infix fun
    val pair = "benz" to "Ricky"//infix func 'to' creates pair
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)//'to' creatively called 'onto'
    val myPair = "Ricky" to "Sensei"
    println(myPair)

    val joan = Human("Joan")
    val nzavi = Human("Nzavi")
    joan likes nzavi //infix notation on methods

}

class Human(val name: String) {
    val likedPeople = mutableListOf<Human>()
    infix fun likes(other: Human) {
        likedPeople.add(other)
    }//ma // king containing class the first parameter
}