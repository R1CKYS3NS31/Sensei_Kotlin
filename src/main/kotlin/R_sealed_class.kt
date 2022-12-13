sealed class Mammal(val name: String)
// sealed class let you restrict the use of inheritance
class Cat(val catName: String) : Mammal(catName)
class Human_(val humanName: String, val job: String) : Mammal(humanName)
fun greetMammal(mammal: Mammal):String{
    when(mammal){
        is Human_ -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}
fun main(){
    val cat:Mammal = Cat("Snowy")
    val human_:Mammal = Human_("Ricky","Software Engineer")
    println(greetMammal(cat))
    println(greetMammal(human_))
}