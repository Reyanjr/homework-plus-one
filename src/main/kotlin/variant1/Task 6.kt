package variant1

class `Task 6` {
    interface FuelEfficient {
        fun fuelEfficiency(): String
    }

    class ElectricCar(val make: String, val model: String, val year: Int, val batteryCapacity: Double) : FuelEfficient {
        override fun fuelEfficiency(): String {
            return "This $make $model is powered by electricity and has a battery capacity of $batteryCapacity kWh."
        }
    }

    class HybridCar(val make: String, val model: String, val year: Int, val mileage: Double, val fuelCapacity: Double) :
        FuelEfficient {
        override fun fuelEfficiency(): String {
            return "This $make $model is a hybrid car with a mileage of $mileage miles per gallon and a fuel capacity of $fuelCapacity gallons."
        }
    }

    fun main() {
        val electricCar = ElectricCar("Tesla", "Model S", 2023, 100.0)
        val hybridCar = HybridCar("Toyota", "Prius", 2024, 50.0, 11.9)

        println("Electric Car Efficiency: ${electricCar.fuelEfficiency()}")
        println("Hybrid Car Efficiency: ${hybridCar.fuelEfficiency()}")
    }

}