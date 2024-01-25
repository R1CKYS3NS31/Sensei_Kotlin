class Configuration(var host: String, var port: Int)

fun Configuration.start() {
    println("starting server...")
}

fun Configuration.run() {
    println("server is running...")
}

fun Configuration.hosted() {
    println("hosting at $host:$port")
}

fun Configuration.load(int: Int) {
    print("loading...$int ")
}

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)
//    with is a non-extension function that can access members of its argument concisely:
//    you can omit the instance name when referring to its members.
    with(configuration) {
        start()
        for (i in 1..5) load(i)
        run()
        println("$host:$port")
        hosted()
    }
//    instead of
    println("${configuration.host}:${configuration.port}")
}