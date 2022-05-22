
/**
 * @param {number[]} nums
 * @return {number}
 */
var waysToSplitArray = function (nums) {
    let totalSum = nums.reduce((x, y) => x + y);
    let count = 0;
    let sumFirstHalf = 0;
    
    for (let i = 0; i < nums.length - 1; ++i) {
        sumFirstHalf += nums[i];
        if (sumFirstHalf >= totalSum - sumFirstHalf) {
            ++count;
        }
    }
    return count;
};
