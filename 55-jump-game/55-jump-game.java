class Solution {
    public boolean canJump(int[] nums) {
        int [] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    public boolean helper(int[] nums,int index,int[] dp)
    {
        if(index==nums.length-1)
            return true;
        if(index>=nums.length)
            return false;
        if(dp[index]!=-1)
        {
            if(dp[index]==1)
                return true;
            else
                return false;
        }
        
        int max=nums[index];
        if(max==0)
            
            return false;
        boolean ans=false;
    
        for(int i=1;i<=max;i++)
        {
            ans = helper(nums,index + i,dp);
            if(ans==true)
                break;
        }
        if(ans)
            dp[index]=1;
        else
            dp[index]=0;
        return ans;
    }
}