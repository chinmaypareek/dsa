// Brute
 HashMap<Integer, Integer> hm = new HashMap<>();
 for(int i=0;i<nums.length;i++) {
    if(hm.containsKey(nums[i])) {
        hm.put(nums[i], hm.get(nums[i]) + 1);
    } else {
        hm.put(nums[i], 1);
    }
 }
 for(int i=0;i<nums.length;i++) {
    if(hm.get(nums[i]) == 1) {
        return nums[i];
    }
 }
 return -1;


 // Better -> XOR APPROACH -> Doing XOR(^) with same number gives 0
 int XOR = 0;
 for(int i=0;i<nums.length;i++) {
    XOR = XOR^nums[i];
 }
 return XOR;