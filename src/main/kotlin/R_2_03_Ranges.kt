fun main(){
    print("numbers 1 to 10 range:")
    for (a in 1..10) { //iterating over range and includes 10
        print("\t$a")
    }
    print("\nnumbers 1 until 10 range:")
    for (a in 1 until 10) {  //iterating over range and does not include 10
        print("\t$a")
    }
    print("\nnumbers in two steps from 1 to 10:")
    for (a in 1..10 step 2) { //iterating over progression
        print("\t$a")
    }
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println("\nvalue of key 'c' is: ${map["c"]}")

    for (a in 'a'..'z') print(" '$a' ")
    println("\n")
    for (a in 'z' downTo 'a') print(" '$a' ")
}