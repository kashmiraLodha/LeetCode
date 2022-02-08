class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> temp=new ArrayList<>();
        helper(n,k,temp,1);
        return ans;
    }
    public void helper(int n,int k, List<Integer> temp,int index)
    {
        if(n==0&&temp.size()==k)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(n<0||temp.size()>k)
            return;
        for(int i=index;i<=9;i++)
        {
            if(n>=i)
            {   temp.add(i);
                helper(n-i,k,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}