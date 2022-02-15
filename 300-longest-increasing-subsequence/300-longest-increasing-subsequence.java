class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] last_ele=new int[nums.length];
        last_ele[0]=nums[0];
        int len=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>last_ele[len-1])
            {
                last_ele[len]=nums[i];
                len++;
            }
            else
            {
               int idx = BinarySearch(last_ele,0,len-1,nums[i]);
                last_ele[idx]=nums[i];
                
            }
        }
            return len;

    }
    public int BinarySearch(int[] last_ele,int i,int j,int ele)
    {
        int low=i;
        int high=j;
        int idx=i;
        while(low<=high)
        
        {
           int mid = (high-low)/2+low;
            if(last_ele[mid]>=ele)
            {
                idx=mid;
                high=mid-1;
            }
            else
                low=mid+1;
            
        }
        return idx;
    }
    
}