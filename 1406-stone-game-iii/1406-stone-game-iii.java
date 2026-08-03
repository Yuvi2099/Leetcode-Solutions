class Solution {
    public String stoneGameIII(int[] s) {
        int n=s.length;
        int[]dp=new int[n+1];
        for(int i=n-1;i>=0;i--){
            dp[i]=s[i]-dp[i+1];
            if(i+2<=n) dp[i]=Math.max(dp[i],s[i]+s[i+1]-dp[i+2]);
            if(i+3<=n) dp[i]=Math.max(dp[i],s[i]+s[i+1]+s[i+2]-dp[i+3]);
        }
        if(dp[0]>0) return "Alice";
        else if(dp[0]<0) return "Bob";
        return "Tie";
    }
}