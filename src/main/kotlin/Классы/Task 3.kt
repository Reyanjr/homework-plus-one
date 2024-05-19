package Классы

class `Task 3` {
    class MusicInstrument(val type: String, val name: String, val yearOfManufacture: Int) {
        fun getInstrumentInfo(): String {
            return "Type: $type, Name: $name, Year of Manufacture: $yearOfManufacture"
        }
    }

    // Пример использования:
    fun main() {
        val instrument = MusicInstrument("String", "Violin", 2020)
        println(instrument.getInstrumentInfo())
    }
}