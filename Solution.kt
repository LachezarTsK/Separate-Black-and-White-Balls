
class Solution {
    fun minimumSteps(input: String): Long {
        var ones = 0
        var minSwapsZeroesAndOnes: Long = 0

        for (digit in input) {
            if (digit == '1') {
                ++ones
            } else {
                minSwapsZeroesAndOnes += ones
            }
        }
        return minSwapsZeroesAndOnes
    }
}
