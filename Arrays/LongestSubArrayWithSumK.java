// [1,1,2,2,1,1,1,4,5]
int len = 0;
for(int i=0;i<nums.length;i++) {
    int sum = 0;
    for(int j=i;j<nums.length;j++) {
        sum += arr[j];
        if(sum == k) {
            len = Math.max(len, j-i+1);
        }
    }
}