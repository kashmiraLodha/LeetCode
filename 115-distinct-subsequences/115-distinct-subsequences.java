class Solution {
    public int numDistinct(String s, String t) {
        int [][]dp=new int[s.length()][t.length()];
        for(int [] arr : dp)
            Arrays.fill(arr,-1);
        return helper(s,t,0,0,dp);
    }
    public int helper(String s,String t, int i,int j,int[][]dp)
    {
        if(j==t.length())
            return 1;
        
        if(i>=s.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int inc=0;
        int exc=0;
        if(t.charAt(j)==s.charAt(i))
            inc=helper(s,t,i+1,j+1,dp);
        exc=helper(s,t,i+1,j,dp);
        return dp[i][j]=inc+exc;
    }
}