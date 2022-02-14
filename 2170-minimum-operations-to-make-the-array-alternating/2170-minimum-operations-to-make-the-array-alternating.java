class Solution {
   public int minimumOperations(int[] nums) {
        // make count for even & odd indices elements
        int[] evenCount = new int[100001];
        int[] oddCount= new int[100001];
        int maxi=0;
        int n = nums.length;
        for (int i = 0; i < n; i += 1) {
            
            if (i%2!=0) {
                oddCount[nums[i]]++;
                
            }
            else
                evenCount[nums[i]]++;
            maxi=Math.max(maxi,nums[i]);
        }
       int firstMaxEven=0;int freqFirstMaxEven=0;
        int firstMaxOdd=0;int freqFirstMaxOdd=0;
        int secondMaxEven=0;int freqSecondMaxEven=0;
          int secondMaxOdd=0;int freqSecondMaxOdd=0;
       for(int i=1;i<=maxi;i++)
       {
           if(evenCount[i]>=freqFirstMaxEven)
           {
               secondMaxEven=firstMaxEven;
               freqSecondMaxEven=freqFirstMaxEven;
               freqFirstMaxEven=evenCount[i];
               firstMaxEven=i;
               
               
           }
           else if(evenCount[i]>=freqSecondMaxEven)
           {
                freqSecondMaxEven=evenCount[i];
               secondMaxEven=i;
           }
           if(oddCount[i]>=freqFirstMaxOdd)
           {
               secondMaxOdd=firstMaxOdd;
               freqSecondMaxOdd=freqFirstMaxOdd;
               freqFirstMaxOdd=oddCount[i];
               firstMaxOdd=i;
               
           }
           else if(oddCount[i]>=freqSecondMaxOdd)
           {
                freqSecondMaxOdd=oddCount[i];
               secondMaxOdd=i;
           }
       }
       if(firstMaxEven!=firstMaxOdd)
       {
         return n-freqFirstMaxEven-freqFirstMaxOdd;
       }
       else
           return Math.min((n-freqFirstMaxEven-freqSecondMaxOdd),(n-freqSecondMaxEven-freqFirstMaxOdd));
         
}
}