class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>((a,b)->b-a);
        for(int i : stones)
            max.add(i);
        while(max.size()>1)
        {
            int y = max.poll();
            int x = max.poll();
            if(x!=y)
            {
                y = y-x;
                max.add(y);
            }
        }
        if(max.size()==1)
        return max.poll();
        else
            return 0;
        
    }
}