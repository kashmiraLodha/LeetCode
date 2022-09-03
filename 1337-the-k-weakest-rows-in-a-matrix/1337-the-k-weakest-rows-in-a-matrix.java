class Solution {
    public int[] kWeakestRows(int[][] a, int k) {
        int b[]=new int[a.length];
          for(int i=0; i<a.length;   i++){
                int c=0;
            for(int j=0; j<a[0].length;    j++){
               if(a[i][j]==1){
                  c++;
               }
            }
             b[i]=c;
          }
           int ans[]=new int[k];
          for(int i=0; i<k; i++){
        int min=Integer.MAX_VALUE;
         int minin=0;
        for(int j=0; j<b.length;  j++){
          if(b[j]<min){
           min=b[j];
           minin=j;
          }
        }
             ans[i]=minin;
            b[minin]=Integer.MAX_VALUE;
           }
        return ans;
        
    }
}