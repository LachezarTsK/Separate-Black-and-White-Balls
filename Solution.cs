
using System;

public class Solution
{
    public long MinimumSteps(string input)
    {
        int ones = 0;
        long minSwapsZeroesAndOnes = 0;

        foreach (char digit in input)
        {
            if (digit == '1')
            {
                ++ones;
            }
            else
            {
                minSwapsZeroesAndOnes += ones;
            }
        }
        return minSwapsZeroesAndOnes;
    }
}
