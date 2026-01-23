class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[]res=new int[nums.length];
        int rsum=0;
        int lsum=0;
        for(int i:nums){
            rsum=rsum+i;
        }
        for(int i=0;i<nums.length;i++){
            rsum=rsum-nums[i];
            res[i]=Math.abs(lsum-rsum);
            lsum=lsum+nums[i];
        }
        return res;
    }
}