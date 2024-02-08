import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class Color(private val rgb: Int) {
    //has property rgb
    RED(0xFF0000),//each instance must pass argument for the constructor parameter
    GREEN(0x00FF00),
    BLUE(0x0000FF),//number of instances is always finite
    YELLOW(0xFFFF00);//enum class members separated from the instance definition y semicolon

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

enum class State {
    IDLE,
    RUNNING,
    FINISHED
}

/* implementing interfaces in enum class*/
enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(left: Int, right: Int): Int = apply(left, right)
}

fun main() {
    val red = Color.RED //access enum instance via the class name.instance
    println(red)
    val green = Color.GREEN
    println(green)
    println(red.containsRed()) //call method pn an enum instance
    println(Color.BLUE.containsRed()) //call method via enum class name
    println(Color.YELLOW.containsRed()) //rgb vales of RED and YELLOW share first bits(FF) so prints true
    val state: State = State.RUNNING
    val message = when (state) {
        State.IDLE -> "it's idle"
        State.RUNNING -> "it's running..."
        State.FINISHED -> "it's finished" //does not contain else because all conditions have been checked
    }
    println(message)

    val a = 12
    val b = 21
    for (r in IntArithmetics.values()) {
        println("$r($a,$b) = ${r.apply(a, b)}")
    }
}
