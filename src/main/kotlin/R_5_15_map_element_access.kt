fun main() {
    val map = mapOf("key" to 42)
//    When applied to a map, `[]` operator returns the value corresponding to the given key,
//    or `null` if there is no such key in the map.
    val value1 = map["key"]
    val value2 = map["key2"]
    val value3 = map.getValue("key")
    val mapWithDefault = map.withDefault { k ->
        k.length
    }
    val value4 = mapWithDefault.getValue("key2")
    val keys = map.keys
    try {
        map.getValue("anotherkey")
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }
    println("map: $map")
    println("Value1 is $value1")
    println("Value2 is $value2")
    println("Value3 is $value3")
    println("Value4 is $value4")
    println("keys: $keys")
}