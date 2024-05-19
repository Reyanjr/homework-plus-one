package Классы

class `Task 11` {
    class OnlineCourse(val title: String, initialRating: Int) {
        var rating: Int = initialRating
            set(value) {
                field = when {
                    value < 1 -> 1
                    value > 5 -> 5
                    else -> value
                }
            }
    }

    // Пример использования:
    fun main() {
        val course = OnlineCourse("Kotlin Programming", 4)
        println("Course: ${course.title}, Rating: ${course.rating}")

        course.rating = 5
        println("Updated Rating: ${course.rating}")

        course.rating = 6
        println("Updated Rating: ${course.rating}")

        course.rating = 0
        println("Updated Rating: ${course.rating}")
    }

}