class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int[] arr: dp)
            Arrays.fill(arr,-1);
        return helper(word1,word2,0,0,dp);
    }
    public int helper(String word1,String word2,int i,int j,int[][] dp)
    {
        if(i==word1.length())
            return word2.length()-j;
        if(j==word2.length())
            return word1.length()-i;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=0;
        if(word1.charAt(i)==word2.charAt(j))
            ans=helper(word1,word2,i+1,j+1,dp);
        else
        {
            int delete = helper(word1,word2,i+1,j,dp);
            int insert=  helper(word1,word2,i,j+1,dp);
            int replace= helper(word1,word2,i+1,j+1,dp);
            ans=Math.min(delete,Math.min(insert,replace))
            +1;
            
        }
        return dp[i][j]=ans;
    }
}