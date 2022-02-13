class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[amount+1][coins.length];
        for(int [] arr: dp)
            Arrays.fill(arr,-1);
        int num= helper(coins,amount,0,dp);
        if(num!=1000000)
        return  num;
        else return -1;
        
    }
    public int helper(int[] coins,int amount,int index,int[][]dp)
    {   
        if(amount==0)
            return 0;
        if(index==coins.length)
            return 1000000;
        if(dp[amount][index]!=-1)
            return dp[amount][index];
        int inc=1000000;
        int exc=1000000;
        if(amount>=coins[index])
        {
            inc = 1 + helper(coins,amount-coins[index],index,dp);
        }
        exc = helper(coins,amount,index+1,dp);
        return dp[amount][index]=Math.min(inc,exc);
                
    }
}