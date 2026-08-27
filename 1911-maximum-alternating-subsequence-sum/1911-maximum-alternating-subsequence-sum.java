class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        if(n==1) return (long)nums[0];
        long[][]dp=new long[n+1][2];
        for(long[]x:dp) Arrays.fill(x,-1);
        return solve(0,0,nums,dp);
    }
    private long solve(int idx, int turn, int[]nums, long[][]dp){
        if(idx>=nums.length) return 0;
        if(dp[idx][turn]!=-1) return dp[idx][turn];
        long skip=0,take=0;
        if(turn==0){
            take=nums[idx]+solve(idx+1,1,nums,dp);
            skip=solve(idx+1,0,nums,dp);
        }
        else{
            take=solve(idx+1,0,nums,dp)-nums[idx];
            skip=solve(idx+1,1,nums,dp);
        }
        return dp[idx][turn]=Math.max(skip,take);
    }
}