class Solution {
    public boolean isNumber(String s) {
        if(s==null)
            return false;
        
        s = s.trim();
        
        boolean digitSeen = false;
        boolean decimalSeen = false;
        boolean eSeen = false;
        
        for(int i=0;i<s.length();i++){
            
            //digit check
            if(Character.isDigit(s.charAt(i))){
                digitSeen = true;
            }
            
            else if(s.charAt(i)== '.'){
                
                //we cannot have multiple decimal or decimal after e symbol
                if(decimalSeen  || eSeen) return false;
                
                decimalSeen = true;
            }
            
            else if(s.charAt(i)=='e' || s.charAt(i)=='E'){
                
                //we cannot have multiple e's, it cannot be at the end, it cannot start without reading a digit
                if(eSeen || i == s.length()-1 || !digitSeen)  return false;
                    
                eSeen = true;
            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-'){
                
                //we cannot have it at the end
                //can only have only if it right after symbol e
                if((i!=0 && s.charAt(i-1)!='e') || i == s.length()-1) return false;
            }
            else{
                return false;
            }
        }
        
        //if we don't see any digit, then its not a valid number, so lets return digitSeen
        return digitSeen;
    }
}