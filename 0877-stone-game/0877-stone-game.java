class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int[][]dp=new int[n][n];
        int sum=0;
        for(int i:piles) sum+=i;
        for(int[]x:dp) Arrays.fill(x,-1);
        int a=solve(0,n-1,piles,dp);
        int b=sum-a;
        return a>b;
    }
    private int solve(int i, int j, int[] piles, int[][]dp){
        if(i>j) return 0;
        if(i==j) return piles[i];
        if(dp[i][j]!=-1) return dp[i][j];
        int pi=piles[i]+Math.min(solve(i+1,j-1,piles,dp),solve(i+2,j,piles,dp));
        int pj=piles[j]+Math.min(solve(i+1,j-1,piles,dp),solve(i,j-2,piles,dp));
        return dp[i][j]=Math.max(pi,pj);
    }
}