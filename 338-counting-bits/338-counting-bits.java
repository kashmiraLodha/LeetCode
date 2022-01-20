class Solution {
    public int[] countBits(int n) {
        int count = 0;
    int[] ans = new int[n + 1];
    
    for (int i = 1; i <= n; i++) {
      count = 0;
      int num = i;
      while (num != 0) {
        count += (num & 1);
        num >>= 1;
      }
      ans[i] = count;
    }
    
    return ans;
  
    }
}