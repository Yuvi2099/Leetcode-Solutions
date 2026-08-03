class Solution {
    int n;
    public String stoneGameIII(int[] s) {
        n=s.length;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        int res=Integer.MIN_VALUE;
        res=solve(s,0,dp);
        if(res>0) return "Alice";
        else if(res<0) return "Bob";
        return "Tie";
    }
    private int solve(int[] s, int i, int[] dp){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int res=s[i]-solve(s,i+1,dp);
        if(i+1<n) res=Math.max(res,s[i]+s[i+1]-solve(s,i+2,dp));
        if(i+2<n) res=Math.max(res,s[i]+s[i+1]+s[i+2]-solve(s,i+3,dp));
        return dp[i]=res;
    }
}