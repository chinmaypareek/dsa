class Solution {
    public int trap(int[] height) {
        //Naive Solution - But TLE will come
        // int res = 0;
        // for(int i=1;i<height.length-1;i++) {
        //     int lMax = height[i];
        //     for(int j=0;j<i;j++) {
        //         lMax = Math.max(lMax, height[j]);
        //     }
        //     int rMax = height[i];
        //     for(int k=i+1;k<height.length;k++) {
        //         rMax  =Math.max(rMax, height[k]);
        //     }
        //     res += Math.min(lMax, rMax) - height[i];
        // }
        // return res;
        
        //Better Solution
        int res = 0;
        int n = height.length;
        int lMax[] = new int[n];
        int rMax[] = new int[n];
        lMax[0] = height[0];
        for(int i=1;i<n;i++) {
            lMax[i] = Math.max(height[i], lMax[i-1]);
        }
        rMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--) {
            rMax[i] = Math.max(height[i], rMax[i+1]);
        }
        for(int i=1;i<n-1;i++) {
            res += Math.min(lMax[i], rMax[i]) - height[i];
        }
        return res;
    }
}