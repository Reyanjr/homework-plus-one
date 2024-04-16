package variant1

class `Task 5` {
    open class Car(val make: String, val model: String, val year: Int) {
        fun start() {
            println("$make $model is starting.")
        }

        fun stop() {
            println("$make $model is stopping.")
        }
    }

    class ElectricCar(make: String, model: String, year: Int, val batteryCapacity: Double) : Car(make, model, year) {
        fun charge() {
            println("Charging the $make $model.")
        }
    }

    fun main() {
        val myElectricCar = ElectricCar("Tesla", "Model S", 2023, 100.0)

        println("Make: ${myElectricCar.make}")
        println("Model: ${myElectricCar.model}")
        println("Year: ${myElectricCar.year}")
        println("Battery Capacity: ${myElectricCar.batteryCapacity} kWh")

        myElectricCar.start()
        myElectricCar.charge()
        myElectricCar.stop()
    }
}