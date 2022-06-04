class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        if(nums==null || nums.length==0) return ans;
        
        int prefixZeroes[]=new int[nums.length];
        int suffixOnes[]=new int[nums.length];
        
        // Filling PrefixZeroes Array: Stores number of 0s encountered till that index.
        for(int i=0;i<nums.length;i++){
            if(i==0)
                prefixZeroes[i]=nums[i] == 0 ? 1 : 0;
            else
                prefixZeroes[i]=(nums[i] == 0 ? 1 : 0)+prefixZeroes[i-1];
        }
        
        // Filling SuffixOnes Array: Stores number of 1s encountered till that index.
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1)
                suffixOnes[i]=nums[i] == 1 ? 1 : 0;
            else
                suffixOnes[i]=(nums[i] == 1 ? 1 : 0)+suffixOnes[i+1];
        }
        
        // Calculating maximum score that can be generated throughout the array.
        int max=0;
        for(int i=0;i<=nums.length;i++){
            if(i==0)
                max=Math.max(max,suffixOnes[i]);
            else if(i==nums.length)
                max=Math.max(max,prefixZeroes[i-1]);
            else
                max=Math.max(max,prefixZeroes[i-1]+suffixOnes[i]);
        }
        
        // Equating scores at each index to the maximum score to generate answer.
        for(int i=0;i<=nums.length;i++){
            int tempMax=0;
            if(i==0)
                tempMax=suffixOnes[i];
            else if(i==nums.length)
                tempMax=prefixZeroes[i-1];
            else
                tempMax=prefixZeroes[i-1]+suffixOnes[i];
            
            if(tempMax==max) ans.add(i);
        }
        
        return ans;
    }
}