class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int maxlen=0;
        int si=0;
        int ei=0;
        HashMap<Character,Integer> temp=new HashMap<>();
        while(ei<len)
        {
            if(temp.containsKey(s.charAt(ei)))
                si= Math.max(si,temp.get(s.charAt(ei))+1);
            temp.put(s.charAt(ei),ei);
            maxlen=Math.max(maxlen,ei-si+1);
            ei++;
            
        }
        return maxlen;
        
    }
}