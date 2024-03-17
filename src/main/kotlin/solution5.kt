class solution5 {
    / Define a global variable to simulate the first bad version
    var firstBadVersion = 4

    // Function to simulate the provided API call to determine if a version is bad
    fun isBadVersion(version: Int): Boolean {
        // Check if the version is bad based on the simulated first bad version
        return version >= firstBadVersion
    }

    fun firstBadVersion(n: Int): Int {
        var left = 1
        var right = n

        while (left < right) {
            val mid = left + (right - left) / 2

            if (isBadVersion(mid)) {
                right = mid // The bad version is in the current range
            } else {
                left = mid + 1 // The bad version is after the current range
            }
        }

        return left
    }

    fun main() {
        // Example usage
        val n = 5 // Total number of versions
        val badVersion = firstBadVersion(n) // Finding the first bad version
        println("The first bad version is at version $badVersion")
    }

}