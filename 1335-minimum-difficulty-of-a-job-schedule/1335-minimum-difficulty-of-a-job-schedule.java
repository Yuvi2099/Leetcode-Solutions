class Solution {
    public int minDifficulty(int[] job, int d) {
        int n=job.length;
        if(n<d) return -1;
        int[][]dp=new int[n][d+1];
        
        int[]arr=new int[n];
        arr[n-1]=job[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i]=Math.max(job[i],arr[i+1]);
        }
        for(int i=0;i<n;i++) dp[i][1]=arr[i];

        for(int days=2;days<=d;days++){
            for(int i=0;i<=n-days;i++){
                int maxD=0;
                int res=Integer.MAX_VALUE;
                for(int j=i;j<=n-days;j++){
                    maxD=Math.max(maxD,job[j]);
                    res=Math.min(res,maxD+dp[j+1][days-1]);
                }
                dp[i][days]=res;
            }
        }
        return dp[0][d];
    }
}