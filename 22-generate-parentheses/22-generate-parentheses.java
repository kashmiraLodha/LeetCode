class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n,0,0,"");
        return ans;
        
    }
    public void helper(int n, int no,int nc,String temp)
    {
        if(no==n&&nc==n)
        {
            ans.add(temp);
            return;
        }
        if(no<n)
        {
            helper(n,no+1,nc,temp+"(");
        }
        if(nc<no)
        {
            helper(n,no,nc+1,temp+")");
        }
    }
}