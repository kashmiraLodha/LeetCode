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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        leafSequence(root1,ans1);
        leafSequence(root2,ans2);
        return ans1.equals(ans2);


        
    }
    public void leafSequence(TreeNode root,List<Integer>ans)
    {
        if(root==null)
            return;
        if(root.left==null&&root.right==null)
        {  ans.add(root.val);
         return;
         }
        leafSequence(root.left,ans);
        leafSequence(root.right,ans);

    }
}