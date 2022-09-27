class Solution {
    public int findDuplicate(int[] nums) {
        // Naive Approach
       // Arrays.sort(nums);
       //  int res = -1;
       //  for(int i=1;i<nums.length;i++) {
       //      if(nums[i-1] == nums[i]) {
       //          res = nums[i];
       //          break;
       //      }
       //  }
       //  return res;
        
        //Better Approach
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i])+1);
            } else {
                hm.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> e: hm.entrySet()) {
            if(e.getValue() > 1) {
                return e.getKey();
            }
        }
        return -1;
    }
}