class Solution {
    public int minPathCost(int[][] grid, int[][] movecost) {
        
        int[][]dp=new int[grid.length][grid[0].length];
        int i=grid.length-1;
        for(int j=0;j<grid[0].length;j++)
        {
            dp[i][j]=grid[i][j];
        }
        int n=grid.length;
        int m=grid[0].length;
        for(i=n-2;i>=0;i--)
        {
            for(int j=0;j<m;j++)
            {   int ans=Integer.MAX_VALUE;
                int ele = grid[i][j];
                for(int k=0;k<m;k++)
                {
                    ans = Math.min(movecost[ele][k]+dp[i+1][k],ans);
                }
             dp[i][j]=ans+ele;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<m;j++)
            ans=Math.min(ans,dp[0][j]);
        return ans;
    }
}