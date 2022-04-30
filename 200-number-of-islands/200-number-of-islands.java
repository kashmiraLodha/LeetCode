class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(i,j,grid);
                    count++;
                }
                    
            }
        }
        return count;
        
    }
    public void dfs(int sr,int sc,char [][]image)
    {
        if(sr<0|| sc<0 || sr> image.length-1|| sc>image[0].length-1||image[sr][sc]!='1')
            return;
        image[sr][sc]='2';
        dfs(sr+1,sc,image);
        dfs(sr-1,sc,image);

        dfs(sr,sc+1,image);
        dfs(sr,sc-1,image);

        
    }
}