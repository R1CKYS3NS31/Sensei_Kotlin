open class Base(val name:String){
    init {
        println("Initializing base: $name")
    }
    open val size:Int=name.length.also { println("initializing size in base: $it") }
}
class Derived(
    name: String,
    val lastName:String
):Base(name.capitalize().also { println("argument for base") }){
    init {
        println("initializing derived: $name $lastName")
    }

    override val size: Int =
        (super.size+lastName.length)
            .also { println("initializing size in derived: $it")}
}
fun main(){
    println("constructing derived(\"Ricky\",\"Sensei\")")
    Derived("Ricky","Sensei")
}
