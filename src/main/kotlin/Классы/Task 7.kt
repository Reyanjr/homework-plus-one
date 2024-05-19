package Классы

class `Task 7` {
    class Menu(val name: String, val type: String, val items: Array<String>, val prices: Array<Double>) {
        fun getMenuDetails(): String {
            val details = StringBuilder("Menu: $name, Type: $type\nItems:\n")
            for (i in items.indices) {
                details.append("${items[i]}: $${prices[i]}\n")
            }
            return details.toString()
        }
    }

    // Пример использования:
    fun main() {
        val items = arrayOf("Pancakes", "Omelette", "Coffee")
        val prices = arrayOf(5.99, 7.49, 2.99)
        val menu = Menu("Breakfast Menu", "Breakfast", items, prices)
        println(menu.getMenuDetails())
    }

}