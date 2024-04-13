package variant1.`1`.`1`

class `Task 4` {
    abstract class Vehicle(val speed: Int, val color: String) {
        abstract fun makeSound()
    }

    class Car(speed: Int, color: String, val numDoors: Int) : Vehicle(speed, color) {
        override fun makeSound() {
            println("Beep beep!")
        }

        fun honk() {
            makeSound()
        }
    }

    class Bike(speed: Int, color: String, val numWheels: Int) : Vehicle(speed, color) {
        override fun makeSound() {
            println("Ring ring!")
        }

        fun ringBell() {
            makeSound()
        }
    }

}