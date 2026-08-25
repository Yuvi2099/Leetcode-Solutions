class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums) h.add(i);
        for(int i=1;i<=100;i++){
            if(!h.contains(i*k)) return i*k;
        }
        return 101;
    }
}