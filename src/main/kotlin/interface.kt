interface Printer {
    fun print()
}

/* interface to SAM */
fun Printer(block: () -> Unit): Printer = object : Printer {
    override fun print() = block()
}
/* same as */
//fun interface Printer{
//    fun print()
//}