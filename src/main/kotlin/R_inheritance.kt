 open class Dog{//Dog class is open -can be inherited
     open fun sayHello(){//open to override
         println("woo woo!")
     }
 }
 class Yorkshire:Dog(){//Yorkshire class is default final-can't be inherited without open
     override fun sayHello() {//you can put final to prevent being more override
         println("wif wif!")
     }
 }
 fun main(){
     val dog:Dog=Yorkshire()//Dog is default superclass but Yorkshire() is invoked
     dog.sayHello()//fun from child class called
 }