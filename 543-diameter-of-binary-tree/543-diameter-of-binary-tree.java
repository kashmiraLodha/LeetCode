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
    public int diameterOfBinaryTree(TreeNode root) {
    if(root==null)
        return 0;
        int ld=diameterOfBinaryTree(root.left);
        
    int rd=diameterOfBinaryTree(root.right);
    int sd=height(root.right)+height(root.left)+2;
        return Math.max(sd,Math.max(ld,rd));
    }
    private int height(TreeNode node)
    {
        if(node==null)
            return -1;
        int lh=height(node.left);
        int rh=height(node.right);
        
        return 1+Math.max(lh,rh);
        
    }
}