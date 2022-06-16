class Solution {
    public String longestPalindrome(String s) {

          
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0; int maxlen=0;int l=0;
    int r=0;
        for(int g=0; g<s.length(); g++){
            for(int i=0,j=g; j<s.length(); i++,j++){
                if(g==0){
                    dp[i][j] = true;
                    if(g+1>maxlen)
                    {   maxlen=g+1;
                        l=i;
                        r=j;
                    }
                } else if(g == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                         if(g+1>maxlen)
                    {maxlen=g+1;
                        l=i;
                        r=j;
                    }
                    }
                } else{
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = dp[i+1][j-1];
                        if(dp[i][j])    { 
                            if(g+1>maxlen)
                    {   maxlen=g+1;
                        l=i;
                        r=j;
                    }
                        }
                    }
                }
            }
        }
        return s.substring(l,r+1);
    }
    }

