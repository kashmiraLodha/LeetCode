class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows=obstacleGrid.length;
        int cols= obstacleGrid[0].length;
        int[][ ]dp=new int[rows][cols];
        for(int[] arr: dp)
            Arrays.fill(arr,-1);
        return helper(rows-1,cols-1,obstacleGrid,0,0,dp);
        
    }
    public int helper(int row,int col,int[][]obstacleGrid,int cr,int cc,int[][]dp)
    {
        if(cr>row||cc>col)
            return 0;
        if(obstacleGrid[cr][cc]==1)
            return 0;
        if(cr==row && cc==col)
            return 1;
        
        if(dp[cr][cc]!=-1)
            return dp[cr][cc];
        int right = helper(row,col,obstacleGrid,cr,cc+1,dp);
        int down = helper(row,col,obstacleGrid,cr+1,cc,dp);
        return dp[cr][cc]=right+down;
    }
}