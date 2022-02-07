class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return ans;
        helper(digits,"");
        return ans;
        
    }
    static String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void helper(String digits,String temp)
    {
        if(digits.length()==0){
            ans.add(temp);
            return;
        }
        char ch=digits.charAt(0);
        String keyString=key[ch-48];
        for(int i=0;i<keyString.length();i++)
        {
            helper(digits.substring(1), temp+keyString.charAt(i));
        }
    }
}