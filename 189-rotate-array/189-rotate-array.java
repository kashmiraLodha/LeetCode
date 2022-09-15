class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n==1){
            return;
        }
        k=k%n;
        int i = n-k;
        int j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
         int r = n-k-1;
        int s = 0;
        while(s<=r){
            int temp = arr[r];
            arr[r] = arr[s];
            arr[s] = temp;
            r--;
            s++;
        }
        int p = 0;
        int q = n-1;
        while(p<=q){
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }
        
    }
}