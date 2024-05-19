package Классы

class `Task 9` {
    class Employee(val name: String, initialSalary: Double) {
        var salary: Double = initialSalary
            set(value) {
                if (value >= 1000.0) {
                    field = value
                } else {
                    println("Error: Salary cannot be less than 1000.0")
                }
            }
    }

    // Пример использования:
    fun main() {
        val employee = Employee("John Doe", 1200.0)
        println("Name: ${employee.name}, Salary: ${employee.salary}")

        employee.salary = 1500.0
        println("Updated Salary: ${employee.salary}")

        employee.salary = 800.0
        println("Final Salary: ${employee.salary}")
    }

}