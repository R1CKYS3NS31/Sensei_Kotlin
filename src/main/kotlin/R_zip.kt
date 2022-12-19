fun  main(){
    val A  = listOf("a","b","c")
    val B = listOf(1,2,3,4)
    val resultPairs = A to B // merges them into a list of pairs
    val resultReduce = A.zip(B){a,b->"$a$b"} // merges them into string values by the given transformation

    println("A to B: $resultPairs")
    println("\$A\$B: $resultReduce")
}