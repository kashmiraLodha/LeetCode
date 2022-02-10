class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[] []dp=new int[text1.length()][text2.length()];
        for(int [] arr :dp)
            Arrays.fill(arr,-1);
        return helper(text1,text2,0,0,dp);
    }
    public int helper(String text1,String text2,int i,int j,int [][]dp)
    {
        if(i==text1.length()||j==text2.length())
            return 0;
        int ans=0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j))
            ans=helper(text1,text2,i+1,j+1,dp)+1;
        else
        {
            int fd=helper(text1,text2,i+1,j,dp);
            int sd=helper(text1,text2,i,j+1,dp);
            ans=Math.max(fd,sd);
        }
        return dp[i][j]=ans;
        
    }
}