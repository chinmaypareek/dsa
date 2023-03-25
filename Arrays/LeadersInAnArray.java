// Brute

void leader(int arr[]) {
    boolean flag = false;
    for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
            if(arr[i] <= arr[j]) {
                flag = true;
                break;
            }
        }
        if(flag == false) {
            System.out.println(arr[i] + " ");
        }
    }
}

int curr_leader = arr[n-1];
print(curr_leader);
for(int i=n-2;i>=0;i--) {
    if(curr_leader < arr[i]) {
        curr_leader = arr[i]
        print(curr_leader);
    }
}