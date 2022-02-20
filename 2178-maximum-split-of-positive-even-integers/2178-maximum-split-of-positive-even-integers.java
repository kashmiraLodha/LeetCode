class Solution {
    Set<Long> ans;
    
    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 != 0) {
            return new ArrayList<>();
        }
        
        Set<Long> nums = new HashSet<>();
        ans = new HashSet<Long>();
        backtrackAndSum(finalSum, 0, nums);
        
        return new ArrayList<Long>(nums);
    }
    
    private void backtrackAndSum(long finalSum, long prev, Set<Long> nums) {
        if (finalSum == 0) {
            ans = nums;
            return;
        }

        for(long num = prev + 2; num <= finalSum; num += 2) {
            nums.add(num);
            backtrackAndSum(finalSum - num, num, nums);
            
            if (ans.size() > 0) {
                break;
            }
            
            nums.remove(num);
        }
    }
}