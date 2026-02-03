class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        if(h.size()==nums.length){
            return false;
        }
        return true;
    }
}