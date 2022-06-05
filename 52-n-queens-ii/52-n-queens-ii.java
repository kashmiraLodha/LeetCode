class Solution {
	//initalize number of solutions to zero
    int ans = 0;
    public int totalNQueens(int n) {
	//create a boolean matrix to keep track of alloted queen positions
        boolean[][] check = new boolean[n][n];
        recursion(0,n,check);
        return ans;
    }
    void recursion(int row, int n , boolean[][] check){
	//if row reaches end of the matrix which happens only when we find out a solution, So incremet the ans
        if(row==n){
            ans++;
            return;
        }
		//Iterating through each column to identify a valid position in a specific row
        for(int col = 0; col<n ; col++){
		//check if position is valid
            if(valid(row,col,n,check)){
			//if valid ,allot the position to a queen
                check[row][col] = true;
				//move to the next row and repeat the same
                recursion(row+1,n,check);
				//At last clear the alloted position to find out new solution
                check[row][col] = false;
            }
        }
    }
    boolean valid(int row,int col,int n,boolean[][] check){
	//check if any queen alloted in current col iterating through all the rows
        for(int i = 0; i<row;i++){
            if(check[i][col]) return false;
        }
        int i = row; int j = col;
		//check if any queen present in the upper left diagonal 
        while(i>=0 && j>=0){
            if(check[i][j]) return false;
            i--;
            j--;
        }
		//check if any queen present in upper right diagonal
        i = row; j = col;
        while(i>=0 && j<n){
            if(check[i][j]) return false;
            i--;
            j++;
        }
        return true;
    }
}