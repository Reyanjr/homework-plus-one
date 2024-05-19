package Классы

class `Task 6` {
    class Course(val name: String, val professor: String, val students: Array<String>) {
        fun getCourseInfo(): String {
            val studentsList = students.joinToString(", ")
            return "Course: $name, Professor: $professor, Students: $studentsList"
        }
    }

    // Пример использования:
    fun main() {
        val students = arrayOf("Alice", "Bob", "Charlie")
        val course = Course("Introduction to Kotlin", "Dr. Smith", students)
        println(course.getCourseInfo()) // Вывод: Course: Introduction to Kotlin, Professor: Dr. Smith, Students: Alice, Bob, Charlie
    }

}