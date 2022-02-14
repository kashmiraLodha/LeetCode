class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
        int[][] dp=new int[matrix.length][matrix.length];
        for(int [] arr : dp)
            Arrays.fill(arr,-200);
        
        for(int i=0;i<matrix[0].length;i++)
        {
           int temp = helper(matrix,0,i,dp);
            System.out.println(temp);
            ans = Math.min(ans,temp);
        }
        return ans;
    }
    public int helper(int[][]matrix,int cr,int cc,int [][] dp)
    {   
        if(cr<0||cc<0||cr>=matrix.length||cc>=matrix[0].length)
            return Integer.MAX_VALUE ;
        if(cr==matrix.length-1)
            return matrix[cr][cc];
        if(dp[cr][cc]!=-200)
            return dp[cr][cc];
        int temp=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++)
        {
            if(i==cc)
                continue;
            else 
            {
                int ans= helper(matrix,cr+1,i,dp);
                temp=Math.min(ans,temp);
            }
                
        }
        return dp[cr][cc]=matrix[cr][cc] + temp;

    }
}