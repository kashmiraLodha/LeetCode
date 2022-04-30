class Solution {
    public int numEnclaves(int[][] grid) {
        int count=0;
        int[] temp=new int[1];
        boolean[] flag=new boolean[1];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    dfs(i,j,grid,temp,flag);
                    if(i!=0&&j!=0&&i!=grid.length-1&&j!=grid[0].length-1&&flag[0])
                    {
                       
                        count+=temp[0];
                    }
                    temp[0]=0;
                    flag[0]=true;
                }
            }
        return count;
    }
    public void dfs(int i,int j, int [][]grid,int [] temp,boolean[]flag)
    {
        if(i<0||j<0||j>grid[0].length-1||i>grid.length-1||grid[i][j]!=1)
            return;
        grid[i][j]=2;
        temp[0]++;
        if(i==0||j==0||j==grid[0].length-1||i==grid.length-1)
            flag[0]=false;
        dfs(i+1,j,grid,temp,flag);
        dfs(i-1,j,grid,temp,flag);
        dfs(i,j+1,grid,temp,flag);
        dfs(i,j-1,grid,temp,flag);

    }
}