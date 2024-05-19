package variant1

class `Task 7` {
    interface Vehicle {
        fun displayInfo()
    }

    class Car(val make: String, val model: String, val year: Int) : Vehicle {
        override fun displayInfo() {
            println("Car: $make $model, Year: $year")
        }
    }

    class Bike(val brand: String, val model: String, val year: Int) : Vehicle {
        override fun displayInfo() {
            println("Bike: $brand $model, Year: $year")
        }
    }

    class ElectricCar(val make: String, val model: String, val year: Int, val batteryCapacity: Double) : Vehicle {
        override fun displayInfo() {
            println("Electric Car: $make $model, Year: $year, Battery Capacity: $batteryCapacity kWh")
        }
    }

    fun main() {
        val vehicles: Array<Vehicle> = arrayOf(
            Car("Toyota", "Camry", 2020),
            Bike("Honda", "CBR500R", 2021),
            ElectricCar("Tesla", "Model S", 2023, 100.0)
        )

        for (vehicle in vehicles) {
            vehicle.displayInfo()
        }
    }

}