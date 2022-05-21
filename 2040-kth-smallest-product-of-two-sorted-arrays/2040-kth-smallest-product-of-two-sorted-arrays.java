class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        return kmin(nums1, nums2, k);
    }
    public long kmin(int[] nums1,int[] nums2,long k)
    {
        long lo = -1000_000_0000l;
		long hi = 1000_000_0000l;
		long ans = 0;
        while(lo<=hi)
        {
            long mid = (hi+lo)/2;
            if(count(nums1,nums2,mid)>=k)
            {
                hi = mid-1;
                ans=mid;
            }
            else
                lo=mid+1;
        }
        return ans;
    }
    public long count(int[]nums1,int[] nums2,long product)
    {   long count=0;
        for(int e1 : nums1)
        {   long ans=0;
            int lo=0;
            int hi =nums2.length-1;
         if(e1>=0)
         {  while(lo<=hi)
                
            {
                int mid = (hi+lo)/2;
                if((long)e1*nums2[mid]<=product)
                {
                    ans=mid+1;
                    lo=mid+1;
                    
                }else
                    hi=mid-1;
                
            }
          count+=ans;
         }
         else
         {
            
             while(lo<=hi)
             {
                 int mid = (hi+lo)/2;
                 if((long)e1*nums2[mid]<=product)
                 {
                     ans = nums2.length-mid;
                     hi=mid-1;
                 }
                 else
                     lo=mid+1;
             }
             count+=ans;
         }
        }
     return count;
    }
}