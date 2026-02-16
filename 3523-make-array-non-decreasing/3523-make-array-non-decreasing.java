class Solution {
    public int maximumPossibleSize(int[] nums) {
        int check=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=check){
                check=nums[i];
                count++;
            }
        }
        return count;
    }
}