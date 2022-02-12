class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        
        for(int i:nums)
        {
             sum +=i;
        }
        if(sum%2!=0)
            return false;
        else 
        {
            int[][]dp=new int[nums.length+1][(sum/2)+1];
            for(int[]ar :dp )
                Arrays.fill(ar,-1);
            if(helper(nums,sum/2,dp,0)==1)
                return true;
            else 
                return false;
        }
    }
    public int helper(int []nums,int sum,int [][]dp,int index)
    {
        if(sum==0)
            return 1;
        if(index==nums.length)
            return 0;
        if(dp[index][sum]!=-1)
            return dp[index][sum];
        int ans=0;
        int inc=0;
        int exc=0;
        if(sum>=nums[index])
        {
           inc   = helper(nums,sum-nums[index],dp,index+1) ;
             exc = helper(nums,sum,dp,index+1);
            if(inc==1||exc==1)
                ans=1;
            else
                ans=0;
            
            
        }
        else
            ans=helper(nums,sum,dp,index+1);
        return dp[index][sum]=ans;
    }
    
}