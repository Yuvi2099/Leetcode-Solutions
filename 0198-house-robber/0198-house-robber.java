class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,nums,dp);
    }
    private int solve(int idx, int[]nums, int[]dp){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int rob=nums[idx]+solve(idx+2,nums,dp);
        int skip=solve(idx+1,nums,dp);
        return dp[idx]=Math.max(rob,skip);
    }
}