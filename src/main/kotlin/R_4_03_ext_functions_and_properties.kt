data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)
// add extension function for the Order type
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull {
    it.price
}?.price ?: 0F
// add an extension property for the Order type
val Order.commaDelimitedItemNames: String get() = items.map { it.name }.joinToString(" ")

fun main() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("water", 12.0F)))
    println("Max priced item name: ${order.maxPricedItemValue()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}              