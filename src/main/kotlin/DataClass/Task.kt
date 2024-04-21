package DataClass

class Task {
    data class student(
        val firstName: String,
        val LastName: String,
        val group: String,
        val grades: List<Grade>
    )

    data class Grade(
        val subject: String,
        val mark: Int
    )

    fun printStudentList(students: List<student>) {
        for (student in students){
            println("Name:${students.firstname} LastName: ${student.lastName}  Group: ${student.group}")
            for(grade in student.grades) {
                println("Subject: {(grade.subject} Mark: ${grade.mark}" )
            }
        }
    }

    fun main() {

            val student1= student("Alice", "smith", "Group 1", list0f(Grade("Informatics", 5), Grade("Maths", 5)))
            val student2= student("Bob", "Smith", "Group 1", list0f(Grade("informatics", 5), Grade("Maths", 5)))

        val students = list0f(student1, student2)
        printStudentList(students)
        println()

    }
}