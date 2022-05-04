class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q=new LinkedList<>();
        q.add(entrance);
        int level =0 ;
        int [][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        boolean[][] visited=new boolean[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]]=true;
        while(!q.isEmpty())
        {
            level++;
            int size=q.size();
            while(size-->0)
            {
                int[] rm=q.remove();
                int r = rm[0];
                int c= rm[1];
                
                for(int i=0;i<dir.length;i++)
                {
                    int row=r+dir[i][0];
                    int col = c+dir[i][1];
                    if(row<0||col<0||row>maze.length-1||col>maze[0].length-1||maze[row][col]=='+'||visited[row][col])
                    continue;
                    visited[row][col]=true;
                    if(row==0||col==0||row==maze.length-1||col==maze[0].length-1)
                        return level;
                    q.add(new int[]{row,col});
                    
                }
            }
        }
        return -1;
        
    }
}