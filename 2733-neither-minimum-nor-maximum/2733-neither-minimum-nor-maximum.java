class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        for(int i:nums){
            if(i!=max && i!=min) return i;
        }
        return -1;
    }
}