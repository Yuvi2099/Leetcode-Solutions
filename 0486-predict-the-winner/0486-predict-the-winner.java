class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i:nums) total+=i;

        int[][]dp=new int[n][n];
        for(int[]x:dp) Arrays.fill(x,-1);

        int p1=solve(0,n-1,nums,dp);
        int p2=total-p1;
        return p1>=p2;
    }
    private int solve(int i, int j, int[]nums, int[][]dp){
        if(i>j) return 0;
        if(i==j) return nums[i];
        if(dp[i][j]!=-1) return dp[i][j];
        int a=nums[i]+Math.min(solve(i+1,j-1,nums,dp),solve(i+2,j,nums,dp));
        int b=nums[j]+Math.min(solve(i,j-2,nums,dp),solve(i+1,j-1,nums,dp));
        return dp[i][j]=Math.max(a,b);
    }
}