fun main(){
    val kitchen= listOf<String>("spoon","plate","sufuria","cooker","oven")
    for (tool in kitchen){
        println(tool)
    }
    when{
        "my oven" in kitchen-> println("let's bake")
        else-> println("item is not in the kitchen")
    }
    //using lambda expressions
    kitchen
//        .filter { it.startsWith("s") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
    val num=listOf<Int>(23,55,65,34,77,88,73,9,44,50)
    num.filter { num->num>40 }
        .forEach{ println("\t$it is>40")}
    //or
    num.filter { it<50 }
        .forEach { println("\t#$it is <50") }
}