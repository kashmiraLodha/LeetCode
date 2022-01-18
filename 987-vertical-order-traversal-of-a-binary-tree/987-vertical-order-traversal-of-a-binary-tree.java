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
    int total_levels=0;
    int miny=0;
    int maxy=0;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

         Map<Integer, HashMap<Integer, List<Integer>>> map = new HashMap<>();

        helper(root, 0, 0, map);
        for(int i=miny;i<=maxy;i++)
        {
            if(map.containsKey(i))
            {
                HashMap<Integer,List<Integer>> tempMap=map.get(i);
                ArrayList<Integer> tempList = new ArrayList<>();

            for (int j = 0; j <= total_levels; j++) {
                if(tempMap.containsKey(j)) {
                tempList.addAll(tempMap.get(j));
                 }
            }
                        res.add(tempList);

            }
        }
        return res;
        
        
    }
    public void helper(TreeNode root ,int x,int y, Map<Integer,HashMap<Integer,List<Integer>>> map)
    {   
        if(root==null)
            return;
        if(y<miny)
            miny=y;
        if(y>maxy)
            maxy=y;
        if(x>total_levels)
            total_levels=x;
        if(map.containsKey(y))
        {   HashMap<Integer, List<Integer>> tempMap = map.get(y);
            if(tempMap.containsKey(x))
            {
                List<Integer> tempList=tempMap.get(x);
                tempList.add(root.val);
                Collections.sort(tempList);
                tempMap.put(x, tempList);
            }
         else
         {
             List<Integer> tempList=new ArrayList<>();
             tempList.add(root.val);
            tempMap.put(x, tempList);
         }
        map.put(y, tempMap);

        }
        else
        {
           List<Integer> tempList=new ArrayList<>();
             tempList.add(root.val);
            HashMap<Integer, List<Integer>> tempMap = new HashMap<>();
            tempMap.put(x, tempList);
            map.put(y, tempMap);
        }
        helper(root.left, x+1, y-1, map);
        helper(root.right, x+1, y+1, map);
        
    }
}