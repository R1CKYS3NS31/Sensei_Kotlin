open class  Lion(val name:String,private val origin:String){
    fun sayHello(){
        println("$name the lion from $origin says : graoohh!")
    }
}
class Asiatic(name: String):Lion(name=name,"Kenya")
fun main(){
    val lion:Lion=Asiatic("Rufo")
    lion.sayHello()
}