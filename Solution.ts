
function minimumSteps(input: string): number {
    let ones = 0;
    let minSwapsZeroesAndOnes = 0;

    for (let digit of input) {
        if (digit === '1') {
            ++ones;
        } else {
            minSwapsZeroesAndOnes += ones;
        }
    }
    return minSwapsZeroesAndOnes;
};
