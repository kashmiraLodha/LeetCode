class Solution {
    public void solve(char[][] board) {
        
        for(int i=0;i<board.length;i++)
        {
            int j=0;
            if(board[i][j]=='O')
                dfs(i,j,board,'B');
            j = board[0].length-1;
            if(board[i][j]=='O')
                dfs(i,j,board,'B');
            
        }
         for(int j=0;j<board[0].length;j++)
        {
            int i=0;
            if(board[i][j]=='O')
                dfs(i,j,board,'B');
            i= board.length-1;
            if(board[i][j]=='O')
                dfs(i,j,board,'B');
            
        }
        for(int i=1;i<board.length-1;i++)
        {
            for(int j=1;j<board[0].length-1;j++)
            {
                if(board[i][j]=='O')
                    dfs(i,j,board,'X');
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
                if(board[i][j]=='B')
                    board[i][j]='O';
        }
        
    }
    public void dfs(int i ,int j , char [][] board, char ch)
    {
        if(i<0||j<0||i>board.length-1||j>board[0].length-1||board[i][j]!='O')
            return;
        board[i][j]=ch;
        dfs(i+1,j,board,ch);
        dfs(i-1,j,board,ch);    
        dfs(i,j+1,board,ch);    
        dfs(i,j-1,board,ch);    
    }
    
}