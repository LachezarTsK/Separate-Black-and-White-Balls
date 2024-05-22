
public class Solution {

    public long minimumSteps(String input) {
        int ones = 0;
        long minSwapsZeroesAndOnes = 0;

        for (char digit : input.toCharArray()) {
            if (digit == '1') {
                ++ones;
            } else {
                minSwapsZeroesAndOnes += ones;
            }
        }
        return minSwapsZeroesAndOnes;
    }
}
