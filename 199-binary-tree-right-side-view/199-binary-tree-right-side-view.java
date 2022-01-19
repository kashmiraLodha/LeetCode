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
    List <Integer> ans=new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
       preorder(root,1);
        return ans;
    }
    public void preorder(TreeNode root, int level)
    {
        if(root==null)
            return;
        if(ans.size()==level-1)
            ans.add(root.val);
        preorder(root.right,level+1);

        preorder(root.left,level+1);
    }
}