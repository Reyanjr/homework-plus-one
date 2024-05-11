class `Система Управления Инвентарем` {
    // Шаг 1: Определение классов данных
    data class Product(val name: String, val category: String, val price: Double, val quantity: Int)

    // Шаг 2: Создание каталога товаров
    val inventory = listOf(
        Product("Ноутбук", "Электроника", 1500.0, 10),
        Product("Фотоаппарат", "Электроника", 800.0, 5),
        Product("Книга", "Литература", 20.0, 50),
        Product("Футболка", "Одежда", 15.0, 30),
        Product("Кроссовки", "Обувь", 100.0, 20)
    )

    // Шаг 3: Реализация функциональности
    fun printInventory() {
        println("Информация о товарах в магазине:")
        inventory.forEach {
            println("Название: ${it.name}, Категория: ${it.category}, Цена: ${it.price}, Количество: ${it.quantity}")
        }
    }

    fun totalInventoryValue(): Double {
        return inventory.sumByDouble { it.price * it.quantity }
    }

    fun productsByCategory(category: String): List<Product> {
        return inventory.filter { it.category == category }
    }

    // Функция для нахождения товара с самой низкой стоимостью в каждой категории
    fun lowestPricePerCategory(): Map<String, Product> {
        return inventory.groupBy { it.category }
            .mapValues { (_, products) -> products.minByOrNull { it.price }!! }
    }

    // Функция для вывода всех категорий, доступных в инвентаре, без дублирования
    fun uniqueCategories(): Set<String> {
        return inventory.map { it.category }.toSet()
    }

    fun main() {
        printInventory()
        println("Общая стоимость всех товаров на складе: ${totalInventoryValue()}")
        val electronics = productsByCategory("Электроника")
        println("Товары в категории 'Электроника': $electronics")
        println("Товар с самой низкой стоимостью в каждой категории: ${lowestPricePerCategory()}")
        println("Все доступные категории: ${uniqueCategories()}")
    }

}