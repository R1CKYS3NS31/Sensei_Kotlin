fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val daysRates = object {
//        Objects like this are often created in Java as anonymous class instances.
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }
    val total = daysRates.standard + daysRates.festivity + daysRates.special
    print("Total Price: $$total")
}

fun main() {
    rentPrice(10, 2, 1)
}