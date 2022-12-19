fun main(){
    val list = listOf(0,10,20)
    val map = mutableMapOf<String,Int?>()


    println(list.getOrElse(1){42}) // if there return the value
    println(list.getOrNull(10)) // if missing return null
    println(list.getOrElse(10){42}) // if missing return 42
    println("-------------------------------")
    println(map.getOrElse("x"){1})
    map["x"] = 3
    println(map.getOrElse("x"){2})
    map["x"] = null
    println(map.getOrElse("x"){3}) // if null return 3
}