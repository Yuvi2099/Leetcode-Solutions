class Solution {
    public int arrayPairSum(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=nums.length-2;i>=0;i=i-2){
            res=res+nums[i];
        }
        return res;
    }
}