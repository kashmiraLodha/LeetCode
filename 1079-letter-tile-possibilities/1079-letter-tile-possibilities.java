class Solution {
    public int numTilePossibilities(String tiles) {
        char tempArray[] = tiles.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        String ques=new String(tempArray);
        int [] count=new int[1];
        helper(ques,"",count);
        
        return count[0];
        
    }
public void helper(String tiles,String ans,int[] count)
{System.out.println(ans);

    for(int i=0;i<tiles.length();i++)
    {   if(i!=0 && tiles.charAt(i)==tiles.charAt(i-1))
        continue;
        count[0]++;

        String a=tiles.substring(0,i);
        String b=tiles.substring(i+1);
        helper(a+b,ans+tiles.charAt(i),count);
    
        
        
        
    }
}
}