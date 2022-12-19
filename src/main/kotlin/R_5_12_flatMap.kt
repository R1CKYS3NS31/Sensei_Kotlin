fun main(){
    val fruitsBag = listOf("apple","orange","banana","grapes")
    val clothBag = listOf("shirts","pants","jeans")
    val cart = listOf(fruitsBag,clothBag) //
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }
    val flattenMapBag = cart.flatten()

    println("your cart: $cart")
    println("Your bags are: $mapBag")
    println("Things you bought are: $flatMapBag")
    println("flattened map: $flattenMapBag")
}