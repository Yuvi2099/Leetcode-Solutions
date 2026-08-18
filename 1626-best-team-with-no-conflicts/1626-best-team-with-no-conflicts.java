class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n=scores.length;
        int[][]t=new int[n][2];
        for(int i=0;i<n;i++){
            t[i][0]=ages[i];
            t[i][1]=scores[i];
        }
        Arrays.sort(t,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        int[]dp=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            dp[i]=t[i][1];
            for(int j=0;j<i;j++){
                if(t[j][1]<=t[i][1]) dp[i]=Math.max(dp[i],dp[j]+t[i][1]);
            }
            total=Math.max(total,dp[i]);
        }
        return total;
    }
}