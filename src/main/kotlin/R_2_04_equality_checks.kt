fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // same as authors.equal(writers) and sets ignore element order
    println(authors === writers)
}