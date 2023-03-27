//Brute Force Approach
void leftRoatateByOne(int arr[], int n) {
    int temp = arr[0];
    for(int i=1;i<n;i++) {
        arr[i-1] = arr[i];
    }
    arr[n-1] = temp;
}

void leftRotate(int arr[], int n, int D) {
    for(int i=0;i<D;i++) {
        leftRoatateByOne(arr,n);
    }
}

// Better Approach
int temp[] = new int[d];
for(int i=0;i<d;i++) {
    temp[i] = arr[i];
}
for(int i=d;i<n;i++) {
    arr[i-d] = arr[i];
}
for(int i=0;i<d;i++) {
    arr[n-d+i] = temp[i];
}

// Optimal

void leftRotate(int arr[], int d) {
    reverse(arr, 0, d-1);
    reverse(arr, d, n-1);
    reverse(arr, 0, n-1);
}

void reverse(int arr[], int low, int high) {
    while(low <= high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        low++;
        high--;
    }
}
