class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
    List<Pair> contain=new ArrayList<>();
        List<Pair> contains=new ArrayList<>();
        boolean[][] visited= new boolean[grid.length][grid[0].length];
        int ic = grid[row][col];
        dfs(grid,row,col,contain,ic,visited);
      
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(Pair p : contain)
        {   int r=p.i;
            int c=p.j;
            int count=0;
            for(int i=0;i<dir.length;i++)
            {
                int nr = r+dir[i][0];
                int nc = c+dir[i][1];
                if(nr<0||nc<0||nr>grid.length-1||nc>grid[0].length-1)
                    continue;
                if(grid[nr][nc]==ic)
                    count++;
            }
         System.out.println(r+" "+c+" "+count);
         if(count<4)
            contains.add(p);
         
             
            
            
        }
        for(Pair p :contains)
        {
            int r=p.i;
            int c=p.j;
            grid[r][c]=color;
        }
        return grid;
        
    }
    public void dfs(int[][]grid,int r,int c, List<Pair> contain,int ic,boolean[][] visited)
    {
        if(r<0||c<0||r>grid.length-1||c>grid[0].length-1||visited[r][c]||grid[r][c]!=ic)
            return;
        visited[r][c]=true;
        if(grid[r][c]==ic)
            contain.add(new Pair(r,c));
        dfs(grid,r+1,c,contain,ic,visited);
        dfs(grid,r-1,c,contain,ic,visited);
        dfs(grid,r,c+1,contain,ic,visited);

        dfs(grid,r,c-1,contain,ic,visited);


    }
    public class Pair{
        int i;
        int j;
        public Pair(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
}