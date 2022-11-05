// Calculate left height and right height for a particular node
// Choose max. between then and add 1

int height(Node root) {
    if(root == NULL) return 0;
    int lh = height(root.left);
    int rh = height(root.right);
    if(lh > rh) {
        return lh + 1;
    } else {
        return rh + 1;
    }
}