class Solution {
    //THIS IS A RECUSRIVE APPROACH WHICH GIVES TLE
    public int deleteAndEarn(int[] nums) {
        int dp[]=new int[10001];
        Arrays.fill(dp,-1);
        int n=nums.length;
        Arrays.sort(nums);
        int max=nums[n-1];
        int a[]=new int[max+1];
        for(int i:nums)
            a[i]++;
        return f(a,max,dp);
    }
    public int f(int a[],int n,int dp[])
    {
        if(n<=0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        int l=n*a[n]+f(a,n-2,dp);
        int r=f(a,n-1,dp);
        dp[n]= Math.max(l,r);
        return dp[n];
    }
}