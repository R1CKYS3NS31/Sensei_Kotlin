val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")
val readOnlyOpenIssues :Set<String> = openIssues

// A set is an unordered collection that does not support duplicates.
fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}
fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}
fun main() {
    val aNewIssue = "uniqueDescr4"
    val anIssueAlreadyIn = "uniqueDescr2"

//    readOnlyOpenIssues.add() // error

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issie $anIssueAlreadyIn ${getStatusLog((addIssue(anIssueAlreadyIn)))}")
    println("The set: ${openIssues.joinToString("...")}")

    val readOnlyFruits = setOf("apple","banana","cherry","cherry")
    println(readOnlyFruits)



}