/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        if(root.left!=null && findMax(root.left) >= root.val) return false;
        if(root.right!= null && findMin(root.right)<= root.val) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public int findMax(TreeNode node){
        while(node.right!= null){
            node = node.right;
        }
        return node.val;
    }
    public int findMin(TreeNode node){
        while(node.left!= null){
            node = node.left;
        }
        return node.val;
    }
}