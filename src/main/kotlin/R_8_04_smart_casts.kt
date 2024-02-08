import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main() {
    val date: ChronoLocalDate? = LocalDate.now()
    println(LocalDate.now())
    println(date)
    if (date != null) {
        println(date.isLeapYear)
    }
    if (date != null && date.isLeapYear) {
        println("$date is a leap year!")
    }
    if (date == null || !date.isLeapYear) {
        println("There's is no Feb 29 this year...")
    }
    if (date is LocalDate) {
        val month = date.monthValue
        println(month)
    }
}

/* use "as" for casting types */