class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>temp=new ArrayList<>();
        helper(candidates,target,0,temp);
        return ans;
    }
    public void helper(int[] candidates,int target,int index,List<Integer> temp)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
           
            
            if(target>=candidates[i])
            {
            temp.add(candidates[i]);
            helper(candidates,target-candidates[i],i+1,temp);
            temp.remove(temp.size()-1);
            }
             while(i!=candidates.length-1 && candidates[i]==candidates[i+1])
                i++;
            
                
        }
    }
}