class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp=new ArrayList<>();
        helper(n,k,temp,1);
        return ans;
    }
    public void helper(int n,int k, List<Integer> temp,int index)
    {
        if(temp.size()==k)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<=n;i++)
        {
            temp.add(i);
            helper(n,k,temp,i+1);
            temp.remove(temp.size()-1);
            
        }
    }
}