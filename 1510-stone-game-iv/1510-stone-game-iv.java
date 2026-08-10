class Solution {
    public boolean winnerSquareGame(int n) {
        int[]dp=new int[n+1];
        for(int i=0;i<n+1;i++){
            for(int j=1;j*j<=i;j++){
                if(dp[i-j*j]==0){
                    dp[i]=1;
                    break;
                }
            }
        }
        return dp[n]==1;
    }
}