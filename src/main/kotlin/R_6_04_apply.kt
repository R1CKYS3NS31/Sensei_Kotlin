data class Person_(var name:String,var age:Int,var about:String){
    constructor():this("",0,"")
}
fun main(){
    val ricky = Person_()
    val stringDescription = ricky.apply{
        name = "Ricky"
        age = 13
        about = "Android Developer"
    }.toString()
    println(stringDescription)
}