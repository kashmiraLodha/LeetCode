class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count =0;
        boolean [] flag=new boolean[1];
        flag[0]=true;
        for(int i=0;i<grid2.length;i++)
            for(int j=0;j<grid2[0].length;j++)
            {
                if(grid2[i][j]==1)
                {
                    dfs(i,j,grid2,flag,grid1);
                    if(flag[0]==true)
                        count++;
                    flag[0]=true;
                }
            }
        return count;
    }
    public void dfs(int i,int j, int[][]grid2,boolean[] flag,int[][]grid1)
    {
        if(i<0||j<0||i>grid2.length-1||j>grid2[0].length-1||grid2[i][j]!=1)
            return;
        grid2[i][j]=2;
        if(grid1[i][j]!=1)
            flag[0]=false;
        dfs(i+1,j,grid2,flag,grid1);
        dfs(i-1,j,grid2,flag,grid1);
        dfs(i,j-1,grid2,flag,grid1);
        dfs(i,j+1,grid2,flag,grid1);

    }
}