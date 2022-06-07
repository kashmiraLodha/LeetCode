class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k;
        for(k=nums1.length-1;k>=0;k--)
        {    if(i<0 || j<0)
            {   
                break;
            }
            if(i>=0 &&j>=0 && nums1[i]>=nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
            }
            else if(i>=0 && j>=0 && nums1[i]<nums2[j])
            {
                nums1[k]=nums2[j];
                j--;
            }
           
        }
        if(i<0 && j>=0)
        {   
            while(k>=0&& j>=0)
            {   nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        
        
        
    }
}