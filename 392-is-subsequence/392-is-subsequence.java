class Solution {
    public boolean isSubsequence(String s, String t) {
        return helper(s,t);
    }
    public boolean helper(String s,String t)
    {
        if(s.length()==0)
            return true;
        if(t.length()==0)
            return false;
        boolean res= false;
        if(s.charAt(0)==t.charAt(0))
            res = helper(s.substring(1),t.substring(1));
        else
            res = helper(s,t.substring(1));
        return res ;
            
            
    }
}