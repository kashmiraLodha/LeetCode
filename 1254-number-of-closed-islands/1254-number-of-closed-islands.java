class Solution {
    public int closedIsland(int[][] grid) {
       int count=0;
        boolean[] flag =new boolean[1];
        flag[0]=true;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    dfs(i,j,grid,flag);
                    if(i!=0&&i!=grid.length-1&&j!=0&&j!=grid[0].length-1&&flag[0])
                        count++;
                    flag[0]=true;
                        
                }
                    
            }
        }
        return count;
        
    }
    public void dfs(int i,int j, int[][]grid,boolean[] flag)
    {
        if(i<0||j<0||i>grid.length-1||j>grid[0].length-1||grid[i][j]!=0)
            return;
        if(i==0||j==0||j==grid[0].length-1||i==grid.length-1)
            flag[0]=false;
        grid[i][j]=2;
        dfs(i+1,j,grid,flag);
        dfs(i-1,j,grid,flag);
        dfs(i,j+1,grid,flag);
        dfs(i,j-1,grid,flag);
        

    }
}