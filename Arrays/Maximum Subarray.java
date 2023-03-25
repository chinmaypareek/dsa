// This solution is also known as kadane's Algorithm. In this we will first calculate the max sum of subarrays ending with each element and then later find the max out of them

// Better
int max = Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++) {
    int sum = 0;
    for(int j=i;j<nums.length;j++) {
        sum += nums[j];
         max = Math.max(sum, max);
    }
}
return max;



//  Optimal
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