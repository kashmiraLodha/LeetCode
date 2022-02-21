class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int ans[]= new int[k];
        int t=0;

      PriorityQueue<int[]> q= new PriorityQueue<>((a,b)-> (b[1]-a[1]));  
       Map<Integer,Integer> p= new HashMap();
        
        
       for(int i:nums){
           p.put(i,p.getOrDefault(i,0)+1);
       } 
        
        for(int i:p.keySet()){
            q.offer(new int[] {i,p.get(i)});
        }
        
        
     for(int i=0;i<k;i++){
        ans[i]= q.poll()[0];
     }   
        return ans;
        
    }
}