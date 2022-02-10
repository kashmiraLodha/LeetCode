class Solution {
    public int change(int amount, int[] coins) {
        int[][]dp=new int[amount+1][coins.length];
        for(int i=0;i<amount+1;i++)
        {
            for(int j=0;j<coins.length;j++)
                dp[i][j]=-1;
        }
        return helper(coins,amount,0,dp);
    }
    public int helper(int[] coin,int amount, int index, int[][]dp)
    {
        if(amount==0)
            return 1;
        if(index==coin.length)
            return 0;
        if(dp[amount][index]!=-1)
            return dp[amount][index];
        int inc=0;
        int exc=0;
        if(amount>=coin[index])
            inc=helper(coin,amount-coin[index],index,dp);
        exc=helper(coin,amount,index+1,dp);
        return dp[amount][index]=inc+exc;
            
    }
}