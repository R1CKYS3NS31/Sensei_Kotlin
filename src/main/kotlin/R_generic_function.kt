fun <E> mutableDecimals(vararg elements: E)= mutableSetOf(*elements)//E is any-letter generic type parameter
fun main(){
    val stack = mutableDecimals(0.45,45.34,5.3)//inferred 'any-type' generic parameter
    println("generic type decimal parameter: $stack")
}