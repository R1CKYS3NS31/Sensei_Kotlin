fun main(){
    println("my name is: ${Person.name}")
    val rectangle=Rectangle(5.0,6.0)
    val triangle=Triangle(3.0,4.0,5.0)
    println("Area of rectangle is ${rectangle.calculateArea()}," +
            "its perimeter is ${rectangle.perimeter}")
    println("Area of triangle is ${triangle.calculateArea()}," +
            "its perimeter is ${triangle.perimeter}")
}
abstract class Shape(val sides:List<Double>){
    val  perimeter:Double get() = sides.sum()
    abstract fun calculateArea():Double//abstract function
}
interface RectangleProperties{
    val isSquire:Boolean
}
class Rectangle (//constructor
    var height:Double,
    var length:Double
):Shape(listOf(height,length,height,length)),RectangleProperties{//inheritance
    override val isSquire: Boolean
        get() = length==height
    //instantiating an abstract
    override fun calculateArea(): Double = height*length
}
class Triangle(
    var sideA:Double,
    var sideB:Double,
    var sideC:Double
):Shape(listOf(sideA,sideB,sideC)){
    override fun calculateArea():Double {
        val s=perimeter/2
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC))
    }
}
object Person{//singleton
    const val name:String="Sensei"
}
