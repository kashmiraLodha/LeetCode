// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    

    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
         int[][] dp=new int[N+1][sum+1];
         for(int a[] : dp)
         {
             Arrays.fill(a,-1);
         }
         int ans=helper(N,arr,sum,dp);
         if(ans==0)
         return false;
         else return true;
        
        
    }
    static int helper(int N,int arr[],int sum,int dp[][])
    {
        if(sum==0)
        return 1;
        if(N==0)
        return 0;
        int ans1=0;
        int ans2=0;
        int ans=0;
        if(dp[N][sum]!=-1)
       return dp[N][sum];
        if(arr[N-1]<=sum)
        {
            ans1=helper(N-1,arr,sum-arr[N-1],dp);
            ans2=helper(N-1,arr,sum,dp);
            if(ans1==1||ans2==1)
            ans=1;
            
        }
        else
        ans= helper(N-1,arr,sum,dp);
        return dp[N][sum]=ans;
    }
}