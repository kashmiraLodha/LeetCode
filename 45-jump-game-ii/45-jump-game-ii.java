class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
        
        
    }
    public int helper(int[] nums,int index,int [] dp)
    {
        if(index==nums.length-1)
            return 0;
        if(index>=nums.length)
            return 1000000;
        
        if(dp[index]!=-1)
            return dp[index];
        int max=nums[index];
        int ans=1000000;
        for(int i=1;i<=max;i++)
        {
            int temp = 1 + helper(nums,index+i,dp);
            ans=Math.min(ans,temp);
        }
        return dp[index]=ans;
    }
}