// Brute

int arr[] = new int[nums.length+1];
for(int i=0;i<nums.length;i++) {
    arr[nums[i]] = 1;
}
for(int i=0;i<=nums.length;i++) {
    if(arr[i] == 0) {
        return i;
    }
}
return 0;

// OPtimal

class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int sum1 = N*(N+1)/2;
        int sum2 = 0;
        for(int i=0;i<nums.length;i++) {
            sum2 += nums[i];
        }
        return (sum1-sum2);
    }
}