int SumOfLeafNodes(Node root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) {
        return root.val;
    }
    int s1 = SumOfLeafNodes(root.left);
    int s2 = SumOfLeafNodes(root.right);
    return (s1 + s2);
}