
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

class Solution {
    
public:
    int waysToSplitArray(vector<int>& nums) {
        long long totalSum = accumulate(nums.begin(), nums.end(), static_cast<long long> (0));
        long long sumFirstHalf = 0;
        auto isValidSplit = [&](int value) { sumFirstHalf += value; return sumFirstHalf >= totalSum - sumFirstHalf; };
        return count_if(nums.begin(), nums.end() - 1, isValidSplit);
    }
};
