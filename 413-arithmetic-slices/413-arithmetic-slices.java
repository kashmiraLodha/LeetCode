class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<2)
            return 0;
      int[] diff = new int[nums.length];
        for(int i=1;i<nums.length;i++)
            diff[i]=nums[i]-nums[i-1];
        int count=0;
        for(int i=0;i<nums.length;i++)
            for(int j=i+2;j<nums.length;j++)
            {
                int d= diff[i+1];
                int k=i+1;
                boolean flag = true;
                while(k<=j)
                    
                {
                    if(diff[k++]!=d)
                    {
                        flag = false;
                        break;
                        
                    }
                }
                if(flag==true)
                    count++;
                else
                break;
            }
        return count;
        
    }
}