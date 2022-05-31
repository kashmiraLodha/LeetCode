class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans=0;
       HashMap<Integer, Integer> map = new HashMap<>();
        map.put (0,1);
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            sum += nums[i];
            
            int check = sum % k;
            if(check < 0) check += k; // make rem +ve
            if(map.containsKey(check)) ans += map.get(check);//check
           
            
            if(!map.containsKey(check)) map.put(check, 1);//store
            else  map.put(check, map.get(check) + 1);
            
            
        }
        
        return ans;
        
    }
}