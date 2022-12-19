fun main(){
    val list = listOf(0,10,20)
    println(list.getOrElse(1){42}) // if there return the value
    println(list.getOrNull(10)) // if missing return null
    println(list.getOrElse(10){42}) // if missing return 42

}