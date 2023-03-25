 int ans[] = new int[nums.length];
 int posIndex = 0, negIndex = 0;
for(int i=0;i<nums.length;i++){
   for(int i=0;i<nums.length;i++) {
        if(nums[i]>0) {
            ans[posIndex] = nums[i];
            posIndex +=2;
        } else {
            ans[negIndex] = nums[i];
            negIndex += 2;
        }
    }
}