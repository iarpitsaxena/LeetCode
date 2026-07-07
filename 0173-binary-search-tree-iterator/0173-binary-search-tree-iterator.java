class BSTIterator {
    private List<Integer> inorder;
    private int index;

    public BSTIterator(TreeNode root) {
        inorder = new ArrayList<>();
        index = 0;
        inorderTraversal(root);
    }
    private void inorderTraversal(TreeNode node){
        if(node == null) return;
        inorderTraversal(node.left);
        inorder.add(node.val);
        inorderTraversal(node.right);
    }
    
    public int next() {
        return inorder.get(index++);
    }
    
    public boolean hasNext() {
        return index < inorder.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */