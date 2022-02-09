class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int a = helper(cost,0,dp);
        int b = helper(cost,1,dp);
        return Math.min(a,b);

    }
    public int helper(int []cost,int index,int[] dp)
    {
        if(index>=cost.length)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        
        int takeonestep = cost[index]+helper(cost,index+1,dp);
        int taketwostep = cost[index]+helper(cost,index+2,dp);
        return dp[index]=Math.min(takeonestep,taketwostep);
    }
}