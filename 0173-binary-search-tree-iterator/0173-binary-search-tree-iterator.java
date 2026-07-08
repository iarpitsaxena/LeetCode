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
