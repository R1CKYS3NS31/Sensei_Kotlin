class Customer
class Contact(val id: Int, var email: String)//constructor with two parameters

fun main() {
    val customer = Customer()//instance of class customer

    val contact = Contact(1, "email@gmail.com")//instance of class contact
    println(contact.id)//calling parameter id

    println("Default: ${contact.email}")
    contact.email = "Sensei@gmail.com"//updates property email of instance contact
    println("Updated: ${contact.email}")//calling updated parameter email of instance contact
}