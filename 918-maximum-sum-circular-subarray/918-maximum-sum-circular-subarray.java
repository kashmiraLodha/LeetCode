class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, currMax = 0, currMin =0, total =0;
        
        for(int i = 0; i < nums.length ; ++i){
            
            total+= nums[i];
            currMax += nums[i];
            currMin += nums[i];
            
            max = Math.max(max, currMax);
            min = Math.min(min, currMin);
            
            if(currMax <=0 ) currMax = 0;
            if(currMin >=0) currMin = 0;
            
            
        }
        
        //In case all of the elements are negative, return the highest element from the array which is max in this case
        if(max < 0) return max;
        return Math.max(max, total - min);
        
    }
    
}