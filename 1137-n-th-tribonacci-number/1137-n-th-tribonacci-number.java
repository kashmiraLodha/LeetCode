class Solution {
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        return helper(n,dp);
        
    }
    public int helper(int n,int [] dp)
    {
        if(n==0||n==1)
            return n;
        if(n==2)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        int fib1=helper(n-1,dp);
        int fib2=helper(n-2,dp);
        int fib3=helper(n-3,dp);
        return dp[n]=fib1+fib2+fib3;
    }
}