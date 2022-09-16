class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
       int si=0;
        int ei=0;
        int arr[]=new int[256];
        int ans=Integer.MIN_VALUE;
     
        while(ei<s.length()){
            //grow
            arr[s.charAt(ei)]++;
        //shrink
            while(arr[s.charAt(ei)]!=1&&si<=ei){
                arr[s.charAt(si)]--;
                si++;
            }
            
            if(arr[s.charAt(ei)]==1)
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}