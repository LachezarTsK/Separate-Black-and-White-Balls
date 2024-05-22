
#include <string>
using namespace std;

class Solution {

public:
    long long minimumSteps(const string& input)const {
        int ones = 0;
        long long minSwapsZeroesAndOnes = 0;

        for (const auto& digit : input) {
            if (digit == '1') {
                ++ones;
            }
            else {
                minSwapsZeroesAndOnes += ones;
            }
        }
        return minSwapsZeroesAndOnes;
    }
};
