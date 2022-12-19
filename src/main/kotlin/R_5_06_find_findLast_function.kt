fun main() {
    val words = listOf("lets", "find", "something", "in", "collection", "somehow")
    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }
    val nothing = words.find { it.contains("nothing") }

    println("The first word starting with \"some\" is \"$first\"")
    println("The last word starting with \"some\" is \"$last\"")
    println(
        "The first word containing \"nothing\" is ${
            nothing?.let {
                "\"$it\""
            } ?: "null"
        }"
    )
}