class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>k*nums[0]){
                count++;
            }
        }
        return count;
    }
}