fun sum(a:Int, b:Int):Int{//return INt
    return a+b
}
fun multi(c:Int,d:Int)=c*d//inferred return Int
fun printDiv(e:Int,f:Int):Unit{//return void
    println("The division of $e and $f is ${e*f}")//string template
}
fun maxOf(g: Int, h: Int): Int {
    if (g > h) {
        return g
    } else {
        return h
    }
}
fun minOf(i:Int,j:Int)=if (i<j) i else j//expressed as an expression
fun parseInt(str:String):Int?{
    return str.toIntOrNull()
}
fun printProduct(arg1:String,arg2:String){
    val x=parseInt(arg1)
    val y=parseInt(arg2)
    if (x!=null && y!=null){//checks for null
        println("product is: ${x*y}")
    }else{
        println("'$arg1' or '$arg2' is not a number" )
    }
}
fun transform(color:String):Char= when (color){//function that return from when
    "red"->'R'
    "white"->'W'
    "blue"->'B'
    "orange"->'O'
    else->'-'
}
fun main(){
    val add:Int=sum(7,5)//read-only variable-immutable
    val multiply:Int=multi(3,6)
    var addMore:Int=2//read and write variable-mutable
    print("before adding:$addMore")
    addMore+=3
    print(" -after adding 3: $addMore \n")
    println("The sum of the two numbers is: $add")
    println("The multiplication of the two numbers is: $multiply")
    printDiv(9,7)
    println("The maximum number between 76 and 45 is ${maxOf(76,45)}")
    println("The minimum value between 87 and 56 is ${minOf(87,56)}")
    printProduct("4","5")
    printProduct("b","6")
    printProduct("r","t")
    val colorLetter=transform("white")
    println("The initial of the color is: $colorLetter")
}