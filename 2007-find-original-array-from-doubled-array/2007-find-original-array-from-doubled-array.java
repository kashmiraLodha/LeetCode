class Solution {
    public int[] findOriginalArray(int[] changed) {
        int len = changed.length;
        int[] res = new int[len/2];
        if(len%2 != 0 || len==0) return new int[0];
		// This part of code is just to check if the entire array contains zeroes.
        int count_0 = 0;
        for(int i=0 ;i<len;i++){
            if(changed[i] == 0){
                count_0++;
            }
        }
        if(count_0 == len){
            for(int j=0; j<len/2;j++){
                res[j] = 0;
            }
            return res;
        }
		// Till Here
        Arrays.sort(changed);
		// The Main Logic is this one
		// To see if the map contains the double value of the present element
		// If yes, reduce the value of that by 1.
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = len - 1; i>=0; i--){
            if(map.containsKey(changed[i] + changed[i])){
                list.add(changed[i]);
                int val = map.get(changed[i]+changed[i]);
                if(val - 1 == 0){
                map.remove(changed[i]+changed[i]);
                }
                else{
                    map.put(changed[i]+changed[i],val-1);
                }
            }
            else{
            map.put(changed[i],map.getOrDefault(changed[i],0)+1);
            }
        }
        if(list.size() != len/2){
            return new int[0];
        }
		// Convert the list results to arr
        for(int i=0; i<(len/2); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}