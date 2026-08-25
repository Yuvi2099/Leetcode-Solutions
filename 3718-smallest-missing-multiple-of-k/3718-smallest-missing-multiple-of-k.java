class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums){
            if(i%k==0) h.add(i);
        }
        for(int i=1;i<=h.size()+1;i++){
            if(!h.contains(i*k)) return i*k;
        }
        return 0;
    }
}