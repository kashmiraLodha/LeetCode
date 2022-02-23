class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] arr: dp)
            Arrays.fill(arr,-1);
        return helper(m-1,n-1,0,0,dp);
        
    }
    public int helper(int row,int col,int cr,int cc,int[][]dp)
    {
        if(cr==row&&cc==col)
            return 1;
        if(cr>row||cc>col)
            return 0;
        if(dp[cr][cc]!=-1)
            return dp[cr][cc];
        int right = helper(row,col,cr,cc+1,dp);
        int left = helper(row,col,cr+1,cc,dp);
        return dp[cr][cc]=right+left;
    }
}