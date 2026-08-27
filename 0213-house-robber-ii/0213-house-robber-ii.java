class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[]dp1=new int[n+1];
        int[]dp2=new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int opt1=solve(0,n-2,nums,dp1);
        int opt2=solve(1,n-1,nums,dp2);
        return Math.max(opt1,opt2);
    }
    private int solve(int l, int r, int[] nums, int[]dp){
        if(l>r) return 0;
        if(dp[l]!=-1) return dp[l];
        int take=nums[l]+solve(l+2,r,nums,dp);
        int skip=solve(l+1,r,nums,dp);
        return dp[l]=Math.max(take,skip);
    } 
}