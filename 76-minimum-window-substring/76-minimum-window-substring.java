class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
            
        }
        HashMap<Character,Integer> smap=new HashMap<>();
        int i=-1;
        int j=0;
        int mc=0;
        int len=t.length();
        String ans="";
        while(j<s.length() && i<j)
        {
            while(j<s.length() && mc<len)
            {
                char ch=s.charAt(j);
                smap.put(ch,smap.getOrDefault(ch,0)+1);
                if(smap.getOrDefault(ch,0)<=tmap.getOrDefault(ch,0))
                    mc++;
                j++;
            }
            while(i<j && mc==len)
            {   
                String pans=s.substring(i+1,j);
                if(ans.length()==0|| ans.length()>pans.length())
                    ans=pans;
                i++;
                char ch=s.charAt(i);
                if(smap.get(ch)==1)
                    smap.remove(ch);
                else
                smap.put(ch,smap.getOrDefault(ch,0)-1);
                if(smap.getOrDefault(ch,0)<tmap.getOrDefault(ch,0))
                    mc--;
                
                
            }
        }
        return ans;
        
        
    }
}