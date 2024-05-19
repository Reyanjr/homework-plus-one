package Классы

class `Task 10` {
    class InventoryItem(val name: String, initialQuantity: Int, val price: Double) {
        var quantity: Int = initialQuantity
            set(value) {
                if (value >= 0) {
                    field = value
                } else {
                    println("Error: Quantity cannot be negative")
                }
            }
    }

    // Пример использования:
    fun main() {
        val item = InventoryItem("Laptop", 10, 999.99)
        println("Item: ${item.name}, Quantity: ${item.quantity}, Price: ${item.price}")

        // Попытка установить допустимое количество
        item.quantity = 20
        println("Updated Quantity: ${item.quantity}")

        // Попытка установить отрицательное количество
        item.quantity = -5
        println("Final Quantity: ${item.quantity}")
    }

}