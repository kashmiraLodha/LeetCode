class Solution {
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> subsetsWithDup(int[] a) {
        Arrays.sort(a);
        helper(0,a,new ArrayList()); 
        return res;
    }
    public void helper(int start,int[]a,ArrayList<Integer> al) {
        res.add(new ArrayList<>(al));
        for(int i=start;i<a.length;i++) {
            if(i>start && a[i]==a[i-1]) continue;
            al.add(a[i]);
            helper(i+1,a,al);
            al.remove(al.size()-1);
        }
    }
}