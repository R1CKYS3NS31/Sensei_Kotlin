// Functions associateBy and groupBy build maps from the elements of a collection indexed by the specified key.
fun main() {
    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf(
        Person("ricky", "Nakuru", "254712345678"),
        Person("sensei", "Nairobi", "+254787654321"),
        Person("Joseph", "Nyeri", "0712345678"),
        Person("Reuben", "Nyeri", "0787654321"),
    )
    val phoneBook = people.associateBy { it.phone } // builds map of phone to owners, it.phone ids the key selector
    val cityBook = people.associateBy(Person::phone,Person::city) // map from  phone to their cities, Person::city is the valueSelector
    val peopleCities = people.groupBy(Person::city,Person::name) // maps city to name(list)
    val lastPersonality = people.associateBy(Person::city,Person::name) // map city to last name/person

    println("People: $people")
    println("Phone book: $phoneBook")
    println("City book: $cityBook")
    println("People living in each city: $peopleCities")
    println("Last person living in each city: $lastPersonality")
}