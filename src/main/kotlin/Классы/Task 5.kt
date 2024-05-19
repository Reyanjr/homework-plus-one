package Классы

class `Task 5` {
    class TourPackage(val destination: String, val days: Int, val price: Double, val activities: Array<String> ){
        fun getPackageDetails(): String{
            val activitiesList = activities.joinToString(",")
            return "Destination: $destination, Days: $days, Price: $price, Activities: $activities"
        }
    }


    fun main(){
        val activities = arrayOf("Sightseeing", "Hiking", "Camping")
        val package1 = TourPackage("Mount Everest", 7, 1500.0, activities)
        println(package1.getPackageDetails())
    }
}