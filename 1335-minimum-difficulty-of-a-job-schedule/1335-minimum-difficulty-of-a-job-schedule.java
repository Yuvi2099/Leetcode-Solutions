class Solution {
    public int minDifficulty(int[] job, int d) {
        int n=job.length;
        if(n<d) return -1;
        int[][]dp=new int[n][d+1];
        for(int[]x:dp) Arrays.fill(x,-1);
        return solve(job,n,0,d,dp);
    }
    private int solve(int[] job, int n, int idx, int d, int[][]dp){
        if(d==1){
            int maxD=0;
            for(int i=idx;i<n;i++) maxD=Math.max(maxD,job[i]);
            return maxD;
        }
        if(dp[idx][d]!=-1) return dp[idx][d];
        int maxD=0;
        int ans=Integer.MAX_VALUE;
        for(int i=idx;i<=n-d;i++){
            maxD=Math.max(maxD,job[i]);
            int res=maxD+solve(job,n,i+1,d-1,dp);
            ans=Math.min(ans,res);
        }
        return dp[idx][d]=ans;
    }
}