class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long sum=nums[0];
        for(int i=1;i<n;i++){
            sum+=Math.max(nums[i]-nums[i-1],0);
        }
        return sum;
    }
}