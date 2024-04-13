class `1.1` {
    open class Vehicle(val speed: Int, val color: String)

    class Car(speed: Int, color: String, val numDoors: Int) : Vehicle(speed, color) {
        fun displayInfo() {
            println("This car is $color and its speed is $speed km/h. It has $numDoors doors.")
        }
    }

    class Bike(speed: Int, color: String, val numWheels: Int) : Vehicle(speed, color) {
        fun displayInfo() {
            println("This bike is $color and its speed is $speed km/h. It has $numWheels wheels.")
        }
    }

    fun main() {
        val car = Car(120, "red", 4)
        car.displayInfo()

        val bike = Bike(30, "blue", 2)
        bike.displayInfo()
    }

}