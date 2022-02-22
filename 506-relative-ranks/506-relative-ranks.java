class Solution {
    public String[] findRelativeRanks(int[] score) {
        String [] ans=new String[score.length];
        PriorityQueue<Integer> max= new PriorityQueue<>(Collections.reverseOrder());
         HashMap<Integer,Integer> temp=new HashMap<>();
        for(int i=0;i< score.length;i++)
        { max.add(score[i]);
        temp.put(score[i],i);
       
        }
        int i=1;
        
        while(max.size()>0)
        {
            int ele = max.poll();
            
            int index = temp.get(ele);
            if(i==1)
                ans[index]="Gold Medal";
            else if(i==2)
                ans[index]="Silver Medal";
            else if(i==3)
                ans[index]="Bronze Medal";
            else
                ans[index]=Integer.toString(i);
            i++;
            
            
        }
        return ans;
        
    }
}