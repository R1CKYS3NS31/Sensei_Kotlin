class InitOrderDemo(name:String){//primary constructor
    val  firstProperty="first property: $name".also(::println)
    init {
        println("first initializer block that prints $name")
    }
    val secondProperty="second property: ${name.length}".also(::println)
    init {
        println("second initializer block that prints ${name.length}")
    }
}
class constructors{
    init {
        println("init block")
    }
    constructor(i: Int){ //secondary constructor
        println("constructor $i")
    }
}
fun main(){
    InitOrderDemo("Sensei")
//    constructors()
    constructors(5)
}