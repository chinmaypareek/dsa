// Brute

TreeSet<Integer> hs  = new TreeSet<Integer>();
for(int i=0;i<n1;i++) {
    hs.add(arr1[i]);
}
for(int i=0;i<n2;i++) {
    hs.add(arr2[i]);
}
ArrayList<Integer> al = new ArrayList<>();
for(int i : hs) {
    al.add(i);
}

// Optimal

int i = 0,j = 0;
ArrayList<Integer> al = new ArrayList<>();
while(i < n && j < m) {
    if(arr1[i] <= arr2[j]) {
        if(al.size() == 0 || al.get(al.size()-1) != arr1[i]) {
            al.add(arr1[i]);
        }
        i++;
    } else {
        if(al.size() == 0 || al.get(al.size()-1) != arr2[j]) {
            al.add(arr2[j]);
        }
        j++;
    }
    while(i < n) {
       if(al.size() == 0 || al.get(al.size()-1) != arr1[i]) {
            al.add(arr1[i]);
        }
        i++; 
    }
    while(j < m) {
         if(al.size() == 0 || al.get(al.size()-1) != arr2[j]) {
            al.add(arr2[j]);
        }
        j++;
    }
}