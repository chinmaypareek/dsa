// Brute

ArrayList<Integer> al = new ArrayList<>();
for(int i=0;i<n;i++) {
    if(arr[i] != 0) {
        al.add(arr[i]);
    }
}
for(int i=0;i<al.size();i++) {
    arr[i] = al.get(i);
}

for(int i=al.size();i<n;i++) {
    arr[i] = 0;
}

// Optimal -> J will represnt 0, firstly find the first index of 0 which we are doing in the first pass of for loop. i will represent the next element of first zero which we are doing in the second pass of for loop. Then we will check if arr[i] is a non-zero element, if it is we will swap arr[i] and arr[j] with each other so that 0's will mov eto the end.

int j = -1;
for(int i=0;i<n;i++) {
    if(arr[i] = 0) {
        j = i;
        break;
    }
}
for(int i=j+1;i<n;i++) {
    if(arr[i] != 0) {
        swap(arr[i], arr[j]);
        j++;
    }
}