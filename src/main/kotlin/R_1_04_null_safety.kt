fun main() {
    var neverNull:String = "This can't be null"
//    neverNull = null

    var nullable:String? = "You can keep a null here"
    nullable = null

    println(nullable)

    println(describeString("ricky"))
    println(describeString(""))
    println(describeString(null))
}

fun describeString(mayBeString: String?): String {//mayBeString is nullable
    if (mayBeString != null && mayBeString.isNotBlank()) {
        return "String of length ${mayBeString.length}"
    } else {
        return "Empty or null"
    }
}