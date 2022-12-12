open class Dog {
    //Dog class is open -can be inherited
    open fun sayHello() {//open to override
        println("woo woo!")
    }
}

class Yorkshire : Dog() {
    //Yorkshire class is default final-can't be inherited without open
    override fun sayHello() {//you can put final to prevent being more override
        println("wif wif!")
    }
}

//Inheritance with Parameterized Constructor
open class Tiger_(private val origin: String) {
    fun sayHello() = println("A tiger $origin says: grrhhh!")
}

//class SiberianTiger_:Tiger_("Siberia") // or
class SiberianTiger_(val country: String) : Tiger_(origin = country)

fun main() {
    val dog1 = Dog()
    dog1.sayHello()

    val dog: Dog = Yorkshire() //Dog is default superclass but Yorkshire() is invoked
    dog.sayHello()//fun from child class called

//    val tiger:Tiger_= SiberianTiger_() //or
    val tiger: Tiger_ = SiberianTiger_("Siberia")
    tiger.sayHello()
}