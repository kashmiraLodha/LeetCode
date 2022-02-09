class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    public int helper(int[] nums,int index, int[] dp)
    {
        if(index >= nums.length)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        int if_not_rob = helper(nums,index+1,dp);
        int rob = nums[index] + helper(nums,index+2,dp);

        return dp[index]=Math.max(rob,if_not_rob);
    }
}