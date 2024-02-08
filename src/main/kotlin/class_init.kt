class InitOrderDemo(name: String) {
    //primary constructor
    val firstProperty = "first property: $name".also(::println)

    init {
        println("first initializer block that prints $name")
    }

    val secondProperty = "second property: ${name.length}".also(::println)

    init {
        println("second initializer block that prints ${name.length}")
    }
}

class constructors {
    init {
        println("init block")
    }

    constructor(i: Int) { //secondary constructor
        println("constructor $i")
    }
}



/* inline value class[experimental] */
//inline value class Member(private val fullName: String) {
//    init {
//        require(fullName.isNotEmpty()) {
//            "Full name should not be empty"
//        }
//    }
//
//    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
//        require(lastName.isNotBlank()) {
//            "Last name should not be blank"
//        }
//    }
//
//    val length
//        get() = fullName.length
//
//    fun greet() {
//        println("Hello $fullName")
//    }
//}

fun main() {
    InitOrderDemo("Sensei")
//    constructors()
    constructors(5)

//    val member1 = Member("Ricky", "Sensei")
//    val member2 = Member("Deco")
//    member1.greet()
////    member2.greet() // Throws an IllegalArgumentException with the result of calling lazyMessage if the value is false.
//  //  println(member2.length)
}