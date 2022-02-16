class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        for(int i=0;i<strs[0].length();i++)
        {   boolean flag=false;
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length())
                {
                     flag=true;
                    break;
                }
                    if(strs[j].charAt(i)!=ch){
                    flag=true;
                    break;
                }
                    
            }
         if(flag==false)
             ans+=ch;
         else
             return ans;
            
        }
        return ans;
    }
}