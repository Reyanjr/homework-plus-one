package Классы

class `Task 4` {
    class Athlete(val name: String, val sport: String, val country: String) {
        fun getAthleteInfo(): String {
            return "Name: $name, Sport: $sport, Country: $country"
        }
    }

    fun main() {
        val athlete = Athlete("Usain Bolt", "Athletics", "Jamaica")
        println(athlete.getAthleteInfo())
   }
}