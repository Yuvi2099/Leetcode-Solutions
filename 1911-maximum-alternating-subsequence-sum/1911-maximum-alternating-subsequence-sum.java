class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long[][]dp=new long[n+1][2];
        for(long[]x:dp) Arrays.fill(x,-1);
        return solve(0,0,nums,dp);
    }
    private long solve(int i, int opt, int[]nums, long[][]dp){
        if(i==nums.length) return 0;
        if(dp[i][opt]!=-1) return dp[i][opt];
        long skip=solve(i+1,opt,nums,dp);
        long val=nums[i];
        if(opt==1) val=-val;
        long take=solve(i+1,(opt+1)%2,nums,dp)+val;
        return dp[i][opt]=Math.max(take,skip);
    }
}