class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[idx]=nums[i];
                idx++;
            }
        }
        return idx;
    }
}