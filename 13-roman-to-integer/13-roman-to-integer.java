class Solution {
    public int romanToInt(String s) {
       int ans= Convert(s);
        return ans;
    }
    	public static int Convert(String str) {
		// TODO Auto-generated method stub
		int ans=0;
		int arr[]=new int[90];
		arr[(int)('I')]=1;
		arr[(int)('V')]=5;
		arr[(int)('L')]=50;
		arr[(int)('C')]=100;
		arr[(int)('D')]=500;
		arr[(int)('M')]=1000;
        arr[(int)('X')]=10;

		for (int i = 0; i < str.length(); i++) {
//			System.out.println(i);
			
			if(i+1!=str.length()&&(str.charAt(i)=='I'&&str.charAt(i+1)=='V')) {
				ans+=4;
                i++;
               
			}
			else if(i+1!=str.length()&&(str.charAt(i)=='I'&&str.charAt(i+1)=='X')) {
				ans+=9;
                i++;
			}
			else if(i+1!=str.length()&&(str.charAt(i)=='X'&&str.charAt(i+1)=='L')) {
				ans+=40;
                 i++;

			}
			else if(i+1!=str.length()&&(str.charAt(i)=='X'&&str.charAt(i+1)=='C')) {
				ans+=90;
                i++;


			}
			else if(i+1!=str.length()&&(str.charAt(i)=='C'&&str.charAt(i+1)=='D')) {
				ans+=400;
                i++;


			}
			else if(i+1!=str.length()&&(str.charAt(i)=='C'&&str.charAt(i+1)=='M')) {
				ans+=900;
                i++;

			}
		else {
 				ans+=arr[str.charAt(i)];
				
				
		}
            //  if(str.charAt(i) == 'V') ans += 5; 
            // if(str.charAt(i) == 'D') ans += 500;
            //  if(str.charAt(i) == 'M') ans += 1000;  
            // if(str.charAt(i) == 'I') ans += 1;
            // if(str.charAt(i) == 'C') ans += 100;
            // if(str.charAt(i) == 'X') ans += 10;
            
            System.out.println(ans);

            
            

	}
		return ans;
	}
}









// class Solution {
//     public int romanToInt(String s) {
//         int len = s.length();
//         int ans = 0;
        
//         for(int i = 0; i < len; i++){
//             if(s.charAt(i) == 'I'){
//                 if(i+1 < len){
//                     if(s.charAt(i+1) == 'V'){
//                         ans += 4;
//                         i++;
//                         continue;
//                     }
//                     if(s.charAt(i+1) == 'X'){
//                         ans += 9; 
//                         i++;
//                         continue;
//                     }
//                 }
//                 ans += 1;
//             }
//             if(s.charAt(i) == 'V') ans += 5; 
//             if(s.charAt(i) == 'X'){
//                 if(i+1 < len){
//                     if(s.charAt(i+1) == 'L'){
//                         ans += 40;
//                         i++;
//                         continue;
//                     }
//                     if(s.charAt(i+1) == 'C'){
//                         ans += 90; 
//                         i++;
//                         continue;
//                     }
//                 }
//                 ans += 10;
//             }
//             if(s.charAt(i) == 'L') ans += 50;
//             if(s.charAt(i) == 'C'){
//                 if(i+1 < len){
//                     if(s.charAt(i+1) == 'D'){
//                         ans += 400;
//                         i++;
//                         continue;
//                     }
//                     if(s.charAt(i+1) == 'M'){
//                         ans += 900; 
//                         i++;
//                         continue;
//                     }
//                 }
//                 ans += 100;
//             }
//             if(s.charAt(i) == 'D') ans += 500;
//             if(s.charAt(i) == 'M') ans += 1000;     
//         }
        
//         return ans;
//     }
// }