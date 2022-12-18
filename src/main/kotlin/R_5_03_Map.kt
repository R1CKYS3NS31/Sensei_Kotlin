const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 300)

//creates mutable map
val EZPassReport: Map<Int, Int> = EZPassAccounts // creates read-only view of the map
fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId ...") // checks if corresponding map exists
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
        // reads and increments corresponding value wth a constant value
    } else {
        println("Error:Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-pass report: ")
    EZPassReport.forEach { (k, v) ->
        println("ID $k :credit $v") // destructuring
    }//iterates immutable map and prints kye/value pairs
    //using lambda function
}

fun main() {
    accountsReport()//reads account points balance before updates
    updatePointsCredit(1)//updates an existing account
    updatePointsCredit(1)//second update on the same account
    updatePointsCredit(2)
    updatePointsCredit(5)//Tries to update a non-existing account :prints an error message
    accountsReport()//reads the account points balance,after updates
}

//map is a collection of key/value pairs,where each key is unique
// and is used to retrieve the corresponding value
// use infix "to" function often