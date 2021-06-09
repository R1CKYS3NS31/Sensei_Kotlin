fun printAll(vararg messages:String){//vararg allows any number of string arguments
    for(m in messages) println(m)
}
fun printAllWithPrefix(vararg messages:String,prefix:String){
    for (m in messages) println(prefix+m)
}
fun log(vararg entries:String){
    printAll(*entries)//* allows varargs instead of variable argument
}
fun main(){
    printAll("eggs","flour","maize","beans")
    printAllWithPrefix("eggs","flour","maize","beans",prefix = "Fruit: ")
    println(log("-eggs","-flour","-maize","-beans"))
}