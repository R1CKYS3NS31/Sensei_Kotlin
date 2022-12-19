interface SoundBeahavior {
    fun makeSound()
}

class screamBehavior(val n: String) : SoundBeahavior {
    override fun makeSound() = println("${n.toUpperCase()}!!!")
}

class RockAndRollBehavior(val n: String) : SoundBeahavior {
    override fun makeSound() = println("I'm the King of Rick 'N' Roll: $n")
}

class Ricky(n: String) : SoundBeahavior by screamBehavior(n)
class Sensei(n: String) : SoundBeahavior by RockAndRollBehavior(n)

fun main() {
    val ricky = Ricky("Thrash metal")
    ricky.makeSound()
    val sensei = Sensei("Dancin' to the Jailhouse Rock")
    sensei.makeSound()
}