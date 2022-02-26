class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if (low % 2 == 0) low++; //start from odd number
        while (low <= high) { //from low to high number
            count++; //always increase the count
            low += 2; //go to the next odd number
        }
        return count;
    }
}