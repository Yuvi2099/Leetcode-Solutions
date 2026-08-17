class Solution {
    public int stoneGameV(int[] s) {
        int n=s.length;
        if(n==1) return 0;
        int[]pref=new int[n+1];
        for(int i=0;i<n;i++) pref[i+1]=pref[i]+s[i];
        int[][]dp=new int[n+1][n+1];
        for(int[]x:dp) Arrays.fill(x,-1);
        return solve(0,n-1,pref,dp);
    }
    private int solve(int l, int r, int[]pref, int[][]dp){
        if(l==r) return 0;
        if(dp[l][r]!=-1) return dp[l][r];
        int score=0;
        for(int mid=l;mid<r;mid++){
            int lsum=pref[mid+1]-pref[l];
            int rsum=pref[r+1]-pref[mid+1];
            if(lsum<rsum) score=Math.max(score,lsum+solve(l,mid,pref,dp));
            else if(rsum<lsum) score=Math.max(score,rsum+solve(mid+1,r,pref,dp));
            else{
                score=Math.max(score,Math.max(lsum+solve(l,mid,pref,dp),rsum+solve(mid+1,r,pref,dp)));
            }
        }
        return dp[l][r]=score;
    }
}