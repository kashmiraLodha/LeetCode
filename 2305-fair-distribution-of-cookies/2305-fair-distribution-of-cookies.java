class Solution {
    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        backtrack(cookies, cookies.length, 0, k, new int[k]);
        return res;
    }
    
    private void backtrack(int[] cookies, int n, int pos, int k, int[] children) {
        if(pos == n) {
            int max = Integer.MIN_VALUE;
            for(int child : children) {
                max = Math.max(max, child);
            }
            res = Math.min(res, max);
            return;
        }
        
        for(int i=0; i<k; i++) {
            children[i] += cookies[pos];
            backtrack(cookies, n, pos + 1, k, children);
            children[i] -= cookies[pos];
        }
    }
}