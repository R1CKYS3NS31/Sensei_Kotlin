interface SoundBehaviour {
    fun makeSound()
}

class ScreamBehaviour(val n: String) : SoundBehaviour {
    override fun makeSound() = println("${n.toUpperCase()}!!!")
}

class RockAndRollBehaviour(val n: String) : SoundBehaviour {
    override fun makeSound() = println("I'm the King of Rock 'N' Roll: $n")
}

class Ricky(n: String) : SoundBehaviour by ScreamBehaviour(n)
class Sensei(n: String) : SoundBehaviour by RockAndRollBehaviour(n)

fun main() {
    val ricky = Ricky("Thrash metal")
    ricky.makeSound()
    val sensei = Sensei("Dancing to the Jailhouse Rock")
    sensei.makeSound()
}