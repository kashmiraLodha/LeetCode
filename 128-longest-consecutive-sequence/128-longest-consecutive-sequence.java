class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean>map =new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]-1))
            {
                map.put(nums[i],false);
            }
            else
                map.put(nums[i],true);
            if(map.containsKey(nums[i]+1))
                map.put(nums[i]+1,false);
            
        }
        int ans=0;
        int count=0;
        for(int key :map.keySet())
        {
            if(map.get(key))
            {
                count++;
                key++;
                while(map.containsKey(key))
                {
                    key++;
                    count++;
                }
                ans=Math.max(ans,count);
                count=0;
            }
        }
        return ans;
    }
}