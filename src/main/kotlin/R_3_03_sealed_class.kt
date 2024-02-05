sealed class Mammal(val name: String)
// sealed class let you restrict the use of inheritance
class Cat(private val catName: String) : Mammal(catName)
class Human_(private val humanName: String, val job: String) : Mammal(humanName)
fun greetMammal(mammal: Mammal):String{
    return when(mammal){
        is Human_ -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}
fun main(){
    val cat:Mammal = Cat("Snowy")
    val human_:Mammal = Human_("Ricky","Software Engineer")
    println(greetMammal(cat))
    println(greetMammal(human_))
}