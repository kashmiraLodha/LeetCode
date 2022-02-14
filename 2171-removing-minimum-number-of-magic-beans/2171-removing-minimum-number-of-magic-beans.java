class Solution {
    public long minimumRemoval(int[] beans) {
        
        long sum = 0;
        for(int val : beans){
            sum+=val;
        }

        long res = Long.MAX_VALUE;
        System.out.println(res+" -"+sum);
        Arrays.sort(beans);
        
        for(int i=0;i<beans.length;i++){
            long ans = sum - beans[i] - ((beans.length - i -1) * (long)beans[i]);//old sum-new sum gives the number of                 operations.
           
            if(ans<res){
                res=ans;
            }
        }
        return res;
    }

}