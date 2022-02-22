class Solution {
    public int titleToNumber(String columnTitle) {
        int power = columnTitle.length() - 1;
        int sum = 0, index = 0;
        
        while (power >= 0) {
            sum += Math.pow(26, power--) * (columnTitle.charAt(index++) - 'A' + 1);
        }
        return sum;
    }
}
