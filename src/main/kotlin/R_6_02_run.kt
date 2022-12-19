fun main() {
//    Basically, it does the same: executes a code block and returns its result.
//    inside run the object is accessed by this.
//    run operation on something
    fun getNullableLength(ns: String?) {
        println("For \$ns\":")
        ns?.run {
            println("\tis empty " + isEmpty())
            println("\tlength = $length")
            length
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("Kotlin String")
}