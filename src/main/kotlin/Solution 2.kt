class `Solution 2` {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            val mid = (l + r) / 2
            when {
                target < nums[mid] -> r = mid -1
                target > nums[mid] -> l = mid +1
                target == nums[mid] -> return  mid
            }

        }
        return l
    }
}