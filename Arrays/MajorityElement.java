// Brute

for(int i=0;i<nums.length;i++);{
    int count = 0;
    for(int j=0;j<nums.length;j++) {
        if(nums[j] == nums[i]) {
            count++;
        }
    }
    if(count > nums.length/2); {
        return nums[i];
    }
}
return -1;

// Better

HashMap<Integer, Integer> hm = new HashMap<>();
for(int i=0;i<nums.length;i++) {
    if(hm.containsKey(nums[i])) {
        hm.put(nums[i], hm.get(nums[i])+1);
    } else {
        hm.put(nums[i], 1);
    }
}
for(Map.Entry<Integer, Integer> mp : hm.entrySet()) {
    if(mp.getValue() > nums.length/2) {
        return mp.getKey();
    }
}
return -1;

// Optimal -> Moore's Voting Algorithm

public int majority(int nums[]) {
    int count = 0;
    int el = -1;
    for(int i=0;i<nums.length;i++) {
        if(count == 0) {
            count = 1;
            el = nums[i];
        } else (el = nums[i]) {
            count++;
        } else {
            count--;
        }
    }
    int count1 = 0;
    for(int i=0;i<nums.length;i++) {
        if(el == nums[i]) {
            count1++;
        }
        if(count1 > nums.length/2) {
            return el;
        }
    }
    return -1;
}