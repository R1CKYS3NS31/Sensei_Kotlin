fun main() {
    val fruits = listOf("banana", "pineapple", "orange", "mango")//read-only list
    println("The fruits are: ")
    for (item in fruits) { // loops through each fruit and store one by one on item
        println("\t$item")
    }

    //or
    for (index in fruits.indices) {
        println("fruit at $index is ${fruits[index]}")
    }
    when {
//        "orange" in fruits-> println("orange juice")
//        "mango" in fruits-> println("mango juice")
        else -> println("we can't make juice")
    }

    //or return when from a function
    //when statement
    fun today(day: Any): Any =
        when (day) {
            1 -> println("Monday")
            2 -> println("Tuesday")
            3 -> println("Wednesday")
            4 -> println("Thursday")
            5 -> println("Friday")
            6 -> println("Saturday")
            7 -> println("Sunday")
            else -> println("invalid day number")
        }
    today(6)

//    while loop
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 5) {
//        eatACake()
        cakesEaten++
    }

//    do while loop
    do {
        bakeCake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

fun eatACake() {
    println("eating cake")
}

fun bakeCake() {
    println("baking cake") //
}
