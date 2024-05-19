package DataClass

class Task {
    data class Student(
        val firstName: String,
        val lastName: String,
        val group: String,
        val grades: List<Grade>
    )

    data class Grade(
        val subject: String,
        val mark: Int
    )

    fun printStudentList(students: List<Student>) {
        for (student in students){
            println("Name: ${student.firstName} LastName: ${student.lastName}  Group: ${student.group}")
            for(grade in student.grades) {
                println("Subject: ${grade.subject} Mark: ${grade.mark}" )
            }
        }
    }

    fun main() {
        val student1 = Student("Alice", "Smith", "Group 1", listOf(Grade("Informatics", 5), Grade("Maths", 5)))
        val student2 = Student("Bob", "Smith", "Group 1", listOf(Grade("Informatics", 5), Grade("Maths", 5)))

        val students = listOf(student1, student2)
        printStudentList(students)
        println()
    }
}
