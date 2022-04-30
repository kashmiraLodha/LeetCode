class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        int[] count1=new int[1];
         System.out.println(count1[0]);

        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            {                   

                if(grid[i][j]==1)
                {
                    dfs(i,j,grid,count1);
                    if(count1[0]>count)
                        count=count1[0];
                    count1[0]=0;
                    
                }
            }
        return count;
    }
    public void dfs(int sr,int sc, int [][] grid,int[]count1)
    {
        if(sr<0|| sc<0||sr> grid.length-1||sc> grid[0].length-1|| grid[sr][sc]!=1)
            return;
        grid[sr][sc]=2;
        count1[0]++;
            

        dfs(sr+1,sc,grid,count1);
        dfs(sr-1,sc,grid,count1);
        dfs(sr,sc+1,grid,count1);
        dfs(sr,sc-1,grid,count1);   
        
        
    }
}