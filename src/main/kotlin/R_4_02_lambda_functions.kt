fun main() {
    val upperCase1: (String) -> String = { str: String -> str.toUpperCase() }
    val upperCase2: (String) -> String = { str -> str.toUpperCase() }
    val upperCase3 = { str: String -> str.toUpperCase() }
//    val upperCase4 = {str->str.toUpperCase()}
    val upperCase5: (String) -> String = { it.toUpperCase() }
    val upperCase6: (String) -> String = String::toUpperCase

    println(upperCase1("sensei"))
    println(upperCase2("sensei"))
    println(upperCase3("sensei"))
//    println(upperCase4("sensei"))
    println(upperCase5("sensei"))
    println(upperCase6("sensei"))
}