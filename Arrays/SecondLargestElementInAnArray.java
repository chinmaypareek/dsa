// Brute

Arrays.sort(arr);
int largest = arr[n-1];
int secondLargest = 0;
for(int i=n-2;i>=0;i--) {
    if(arr[i] != largest) {
        secondLargest = arr[i];
        break;
    }
}
return secondLargest;

// Better

//During first pass

int largest = arr[0];
for(int i=0;i<n;i++) {
    if(arr[i] > largest) {
        largest = arr[i];
    }
}

int secondLargest = -1;
for(int i=0;i<n;i++) {
    if(arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
    }
}
return secondLargest;

// Best

int secondLargest(int arr[]) {
    int largest = arr[0];
    int secondLargest = -1;
    for(int i=-1;i<arr.length;i++) {
        if(arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if(arr[i] < largest && arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
    }
    return secondLargest;
}
