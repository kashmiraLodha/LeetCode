class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        //if(nums.length==2)
            //return Math.max(nums[])
        
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int a=helper(nums,dp,0,nums.length-1);
        Arrays.fill(dp,-1);
        int b=helper(nums,dp,1,nums.length);
        return Math.max(a,b);
        
        
    }
    public int helper(int[]nums,int[] dp,int index,int ei)
    {
        if(index>=ei)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        int rob=nums[index]+helper(nums,dp,index+2,ei);
        int do_not_rob=helper(nums,dp,index+1,ei);
        return dp[index]=Math.max(rob,do_not_rob);
        
        
    }
}