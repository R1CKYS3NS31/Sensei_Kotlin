data class Person__(var name:String,var age:Int,var about:String){
    constructor(): this("",0,"")
}
fun writeCreationLog(p:Person__){
    println("A new person '${p.name}' was created")
}
fun main(){
    val sensei = Person__("Sensei",14,"Fullstack developer").also {
        writeCreationLog(it)
    }
}