class Customer
class Contact(val id: Int, var email: String)//constructor with two parameters

fun main() {
    val customer = Customer()//instance of class customer

    val contact = Contact(1, "email@gmail.com")//instance of class contact
    println(contact.id)//calling parameter id

    println("Default: ${contact.email}")
    contact.email = "Sensei@gmail.com"//updates property email of instance contact
    println("Updated: ${contact.email}")//calling updated parameter email of instance contact

    val fr = FilledRectangle()
    fr.draw()
}

open class Rectangle_ {
    open fun draw() {
        println("Drawing a rectangle")
    }

    val borderColor: String
        get() = "black"
}

class FilledRectangle : Rectangle_() {
    override fun draw() {
//        super.draw()
        val filer = Filler()
        println("Filling the rectangle")
    }

    inner class Filler {
        fun fill() {
            println("Filling")
        }

        fun drawAndFill() {
            super@FilledRectangle.draw()
            fill()
            println("Draw a filled rectangle with color ${super@FilledRectangle.borderColor}")
        }
    }

    val fillColor: String
        get() = super.borderColor
}

