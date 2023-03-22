import java.util.*;
// Brute Force

for(int i=0;i<n;i++) {
    for(int j=0;j<n;j++) {
        if(i == j) {
            continue;
        }
        if(arr[i] + arr[j] == target) {
            System.out.println('Yes');
        }
    }
}

// Better - Hashing

int res[] = new int[2];
HashMap<Integer, Integer> hm = new HashMap<>();
for(int i=0;i<nums.length;i++) {
    if(hm.containsKey(target-nums[i])) {
        res[1] = i;
        res[0] = hm.get(target-nums[i]);
    }
    hm.put(nums[i], i);
    return res;
}

// Best - Two pointers
int left = 0;
int right = n-1;
Arrays.sort(arr);
for(int i=0;i<n;i++) {
    int sum = arr[left] + arr[right];
    if(sum == target) {
        return "YES";
    } else if(sum < target) {
        left++;
    } else {
        right--;
    }
    return "NO";
}