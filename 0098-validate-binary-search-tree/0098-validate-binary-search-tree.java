class State{
    TreeNode node;
    long min;
    long max;

    State(TreeNode node, long min, long max){
        this.node = node;
        this.min = min;
        this.max = max;
    }
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Stack<State> stack = new Stack<>();
        stack.push(new State(root, Long.MIN_VALUE,Long.MAX_VALUE));
        while(!stack.isEmpty()){
            State current = stack.pop();
            TreeNode node = current.node;
            if(node.val <= current.min || node.val >= current.max) return false;

            if(node.right != null){
                stack.push(new State(node.right,node.val,current.max));
            }
            if(node.left != null){
                stack.push(new State(node.left, current.min, node.val));
            }
        }
        return true;
    }
}