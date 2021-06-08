fun main(){
    val fruits= listOf("banana","pineapple","orange","mango")//read-only list
    println("The fruits are: ")
    for (item in fruits){
        println("\t$item")
    }
    //or
    for (index in fruits.indices){
        println("fruit at $index is ${fruits[index]}")
    }
    when{
//        "orange" in fruits-> println("orange juice")
//        "mango" in fruits-> println("mango juice")
        else-> println("we can't make juice")
    }//or return when from a function
    //when statement
    fun today_(day:Any):Any=
        when (day){
            1-> println("Monday")
            2-> println("Tuesday")
            3-> println("Wednesday")
            4-> println("Thursday")
            5-> println("Friday")
            6-> println("Saturday")
            7-> println("Sunday")
            else-> println("invalid day number")
        }
    today_(6)
    print("numbers 1 to 10 range:")
    for (a in 1..10){//iterating over range and includes 10
        print("\t$a")
    }

    print("\nnumbers 1 until 10 range:")
    for (a in 1 until 10){//iterating over range and does not includes 10
        print("\t$a")
    }
    print("\nnumbers in two steps from 1 to 10:")
    for (a in 1..10 step 2){//iterating over progression
        print("\t$a")
    }
    val map= mapOf("a" to 1,"b" to 2,"c" to 3)
    println("\nvalue of key 'c' is: ${map["c"]}")
}