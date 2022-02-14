class Solution {
    public int minPathSum(int[][] grid) {
            if(grid.length == 0) return 0;

        int[][] dp=new int[grid.length][grid[0].length];
        //for(int [] a : dp)
          //  Arrays.fill(a,-1);
        return helper(grid,0,0,dp);
        
        
    }
    
    public int helper(int [][] grid,int i,int j,int[][]dp)
    {
        if(i==grid.length-1 && j==grid[0].length-1)
        {   
            return grid[i][j];
        }
        if(i>=grid.length||j>=grid[0].length)
            return Integer.MAX_VALUE;
        if(dp[i][j]!=0)
            return dp[i][j];
        return dp[i][j]=grid[i][j]+Math.min(helper(grid,i,j+1,dp),helper(grid,i+1,j,dp));
        
    }
}
