class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        if (nums.length == 0) {
            return ranges;
        }

        int start = nums[0];
        int end = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            int curNum = nums[i];
            int nextNum = nums[i + 1];

            if (nextNum - curNum == 1) {
                end++;
            } else {
                ranges.add(format(start, end));
                start = nextNum;
                end = nextNum;
            }
        }

        ranges.add(format(start, end));

        return ranges;
    }

    private String format(int start, int end) {
        if (start == end) {
            return start + "";
        } else {
            return start + "->" + end;
        }
    }
}