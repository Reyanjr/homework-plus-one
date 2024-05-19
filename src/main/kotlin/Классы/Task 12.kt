package Классы

class `Task 12` {
    class Department(val name: String, initialEmployees: List<String>) {
        var employees: List<String> = initialEmployees
            set(value) {
                if (value.isNotEmpty()) {
                    field = value
                } else {
                    println("Warning: The employee list cannot be empty")
                }
            }
    }

    // Пример использования:
    fun main() {
        val employees = listOf("Alice", "Bob", "Charlie")
        val department = Department("IT Department", employees)
        println("Department: ${department.name}, Employees: ${department.employees}")

        department.employees = listOf("Dave", "Eve")
        println("Updated Employees: ${department.employees}")

        department.employees = listOf()
        println("Final Employees: ${department.employees}")
    }

}