class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue <Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            maxheap.add(nums[i]);
        }
        int a = maxheap.poll();
        int b= maxheap.poll();
        return(a-1)*(b-1);
    }
}