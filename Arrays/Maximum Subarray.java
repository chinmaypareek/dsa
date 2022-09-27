// This solution is also known as kadane's Algorithm. In this we will first calculate the max sum of subarrays ending with each element and then later find the max out of them
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int maxEnding = nums[0];
        for(int i=1;i<nums.length;i++) {
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }
}