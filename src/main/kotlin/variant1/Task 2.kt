package variant1

class `Task 2` {
    open class Vehicle(val speed: Int, val color: String) {
        open fun displayInfo() {
            println("This vehicle is $color and its speed is $speed km/h.")
        }
    }

    class Car(speed: Int, color: String, val numDoors: Int) : Vehicle(speed, color) {
        override fun displayInfo() {
            super.displayInfo()
            println("It is a car with $numDoors doors.")
        }
    }

    class Bike(speed: Int, color: String, val numWheels: Int) : Vehicle(speed, color) {
        override fun displayInfo() {
            super.displayInfo()
            println("It is a bike with $numWheels wheels.")
        }
    }

    fun main() {
        val car = Car(120, "red", 4)
        car.displayInfo()

        val bike = Bike(30, "blue", 2)
        bike.displayInfo()
    }


}