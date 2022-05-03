class Solution {
        class Pair{
                int x;
                int y;
                int step;
              Pair(int x,int y,int step){
                   this.x=x;
                   this.y=y;
                   this.step=step;
             }
        }
    public int shortestPathBinaryMatrix(int[][] grid) {
            int n=grid.length,m=grid[0].length;
     int[][] dirs = {{1,1},{1,0},{0,1},{1,-1},{-1,1},{-1,0},{0,-1},{-1,-1}};
          if(grid[0][0]==1||grid[n-1][m-1]==1)return-1;
        LinkedList<Pair> q=new LinkedList<>();
           q.offer(new Pair(0,0,1));
            
            while(!q.isEmpty()){  
                  Pair rem=q.poll();
                   int r = rem.x;
                   int c = rem.y;
                    int step=rem.step;
                if(r==n-1 && c==m-1) return step;
                    for(int dir[]:dirs){
                             int x=r+dir[0];
                             int y=c+dir[1];
                            if(x>=0 && y>=0 && x<n && y<m && grid[x][y]==0){  
                                     grid[x][y]=1;
                                    q.offer(new Pair(x,y,step+1));    
                            }
                   }
            }
            return -1;
    }
}