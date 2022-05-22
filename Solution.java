
public class Solution {

    public int waysToSplitArray(int[] nums) {

        /*
        Alternatively:
        long totalSum = Arrays.stream(nums).asLongStream().sum();
        In this particular case, the small input does not justify the overhead of starting a stream, 
        which only slows the application.
         */
        long totalSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            totalSum += nums[i];
        }

        int count = 0;
        long sumFirstHalf = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            sumFirstHalf += nums[i];
            if (sumFirstHalf >= totalSum - sumFirstHalf) {
                ++count;
            }
        }
        return count;
    }
}
