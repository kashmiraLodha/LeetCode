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
    List<List<Integer>> ans =new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
		LinkedList<TreeNode> helper = new LinkedList<>();
        	if (root == null) return ans;

		queue.add(root);
    List<Integer> temp=new ArrayList<>();
boolean flag=false;
		while (!queue.isEmpty()) {
			TreeNode rn = queue.remove();
            temp.add(rn.val);
			if (rn.left != null) {
				helper.add(rn.left);
			}
			if (rn.right != null) {
				helper.add(rn.right);

			}
			if (queue.isEmpty()) {
                if(flag==true)
                    Collections.reverse(temp);
                
                ans.add((temp));
				queue = helper;
				helper = new LinkedList<>();
                temp=new ArrayList<>();
                    flag=!flag;
			}
		}
        return ans;
    }
}