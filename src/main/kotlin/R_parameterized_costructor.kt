open class Tiger(private val origin:String){//parameterized constructor
    fun sayHello(){
        println("A tiger from $origin says :grrhhh")
    }
}
class SiberianTiger:Tiger("Siberia")//have to provide argument for base class
fun main(){
    val tiger:Tiger=SiberianTiger()
    tiger.sayHello()
}