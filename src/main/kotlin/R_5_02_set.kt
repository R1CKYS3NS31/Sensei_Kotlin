val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

// A set is an unordered collection that does not support duplicates.
fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}
fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}
fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issie $anIssueAlreadyIn ${getStatusLog((addIssue(anIssueAlreadyIn)))}")
    println("The set: ${openIssues.joinToString("...")}")
}