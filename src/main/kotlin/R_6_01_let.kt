fun customPrint(s:String){
    print(s.toUpperCase())
}
fun main(){
//     Basically, it does the same: executes a code block and returns its result.
//    take something and do something on it/with it
    val empty = "test".let {// returns value of this expression
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty $empty")
    fun printNonNull(str:String?){
        println("Printing...\"$str\":")
        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }
    fun printIfBothNonNull(strOne:String?,strTwo:String?){
        strOne?.let { firstString->
            strTwo?.let { secondString->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }
    printNonNull(null)
    printNonNull("Ricky")
    printIfBothNonNull("First","Second")
}