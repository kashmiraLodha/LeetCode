class Solution {
    public int lengthOfLongestSubstring(String s) {
        int si=0;
        int ei=0;
        int maxlen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(ei<s.length())
        {
            if(map.containsKey(s.charAt(ei)))
            {
                si = Math.max(si,map.get(s.charAt(ei))+1);
            }
            map.put(s.charAt(ei),ei);
            maxlen=Math.max(maxlen,ei-si+1);
            ei++;
        }
        return maxlen;
    }
}