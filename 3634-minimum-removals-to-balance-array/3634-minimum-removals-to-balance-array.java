class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            while((long)nums[r]>(long)k*nums[l]){
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return nums.length-max;
    }
}