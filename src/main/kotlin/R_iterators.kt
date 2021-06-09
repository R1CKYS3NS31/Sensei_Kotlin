class Animal(val name:String)
class Zoo(private val animals:List<Animal>){
    operator fun iterator():Iterator<Animal>{//defines an iterator-returns iterator of Animal constructor
        return animals.iterator()//meets next():Animal && hasNext:Boolean
    }
}
fun main(){
    val zoo=Zoo(listOf(Animal("zebra"),
    Animal("lion"),
    Animal("monkey")))
    for (animal in zoo){
        println("watch out,it's a ${animal.name}")
    }
}