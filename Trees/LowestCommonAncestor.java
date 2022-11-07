// Naive Solution
//In this we will get two path arrays from root to given nodes and the last common node will be the answer

boolean findPath(Node root, ArrayList<Integer> path, int n) {
    if(root == null) {
        return false;
    }
    path.add(root);
    if(root.val == n) {
        return true;
    }
    if(findPath(root.left, path, n) || findPath(root,right, path, n)) {
        return true;
    }
    path.remove(path.size()-1);
    return false;
}

Node LCA(Node root, int n1, int n2) {
    ArrayList<Integer> path1 = new ArrayList<>();
    ArryaList<Integer> path2 = new ArrayList<>();
    if(findPath(root, path1, n1) == false || findPath(root, path2, n2) == false) {
        return null;
    }
    for(int i=0;i<path1.size()-1 && path2.size()-1;i++) {
        if(path1[i+1] != path2[i=1]) {
            return path[i];
        }
    }
    return null;
}
