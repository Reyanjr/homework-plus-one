class Task {
    abstract class Shape {
        abstract fun calculateArea(): Double
    }

    class Circle(val radius: Double) : Shape() {
        override fun calculateArea(): Double {
            return Math.PI * radius * radius
        }
    }

    class Rectangle(val width: Double, val height: Double) : Shape() {
        override fun calculateArea(): Double {
            return width * height
        }
    }

    fun main() {
        val circle = Circle(5.0)
        val rectangle = Rectangle(3.0, 4.0)

        println("Площадь круга: ${circle.calculateArea()}")
        println("Площадь прямоугольника: ${rectangle.calculateArea()}")
    }
}