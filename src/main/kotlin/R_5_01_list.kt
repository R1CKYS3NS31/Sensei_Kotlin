val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers // cast MutableList to immutable/read-only view list
// A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList) or read-only (List).

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser) // update the MutableList
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach { i ->
        println("Some useful info on user $i")
    }
//    getSysSudoers().add(5) // error
}