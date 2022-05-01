class Solution {
    public int maxDistance(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    q.add(new Pair(i,j));
                
            }
        if(q.size()==0||q.size()==grid.length*grid[0].length)
            return -1;
int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};       
        int level=-1;
        while(!q.isEmpty())
        {
            level++;
            int size=q.size();
            while(size-->0)
            {
                Pair p=q.remove();
                for(int i=0;i<4;i++)
                {
                    int rowdash = p.row + dir[i][0];
                    int coldash = p.col + dir[i][1];
                    if(rowdash<0||coldash<0||rowdash>grid.length-1||coldash> grid[0].length-1||grid[rowdash][coldash]==1)
                        continue;
                    q.add(new Pair(rowdash,coldash));
                    grid[rowdash][coldash]=1;
                    

                }
            }
        }
        return level;
    }
    public class Pair
    {
        int row,col;
        public Pair(int row,int col)
        {
            this.row=row;
            this.col=col;
        }
    }
}