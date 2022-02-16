class Solution {
    public boolean squareIsWhite(String coordinates) {
        char [] alphabets = {'a','b','c','d','e','f','g','h'};
        char[] nums={'1','2','3','4','5','6','7','8'};
        char alpha = coordinates.charAt(0);
        char num = coordinates.charAt(1);
        int indexa=0;
        int indexn=0;
        for(int i=0;i<8;i++)
            if(alpha==alphabets[i])
            {indexa=i;
             break;
            }
        for(int i=0;i<8;i++)
            if(num==nums[i])
            { indexn=i;
             break;
            }
        if(indexa%2==0&&indexn%2==0||indexa%2!=0&&indexn%2!=0)
            return false;
        else
            return true;
        
        
    }
}