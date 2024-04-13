package variant1.`1`.`1`

class `Task 3` {
    open class Vehicle(val speed: Int, val color: String) {
        open fun displayInfo() {
            println("Vehicle - Speed: $speed, Color: $color")
        }
    }

    class Car(speed: Int, color: String, val numDoors: Int) : Vehicle(speed, color) {
        override fun displayInfo() {
            super.displayInfo()
            println("Car - Number of doors: $numDoors")
        }

    }

    class Bike(speed: Int, color: String, val numWheels: Int) : Vehicle(speed, color) {
        override fun displayInfo() {
            super.displayInfo()
            println("Bike - Number of wheels: $numWheels")
        }
        
    }

}