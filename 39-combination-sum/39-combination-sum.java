class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp=new ArrayList<>();
        helper(candidates,target,temp,0);
        return ans;
    }
    public void helper(int[]candidates,int target,List<Integer> temp,int index)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(candidates[i]<=target)
            {
                temp.add(candidates[i]);
                helper(candidates,target-candidates[i],temp,i);
                temp.remove(temp.size()-1);
            }
        }
    }
}