class Solution {
    int n;
    public int stoneGameII(int[] piles) {
        n=piles.length;
        int[][][]dp=new int[2][n+1][n+1];
        for(int[][]x:dp){
            for(int[]y:x) Arrays.fill(y,-1);
        }
        return solve(0,0,1,piles,dp);
    }
    private int solve(int person, int i, int m, int[] piles, int[][][]dp){
        if(i>=n) return 0;
        if(dp[person][i][m]!=-1) return dp[person][i][m];
        int stones=0,res;
        if(person==0) res=Integer.MIN_VALUE;
        else res=Integer.MAX_VALUE;
        for(int x=1;x<=Math.min(2*m,n-i);x++){
            stones+=piles[i+x-1];
            if(person==0){
                res=Math.max(res,stones+solve(1,i+x,Math.max(x,m),piles,dp));
            }
            else{
                res=Math.min(res,solve(0,i+x,Math.max(x,m),piles,dp));
            }
        }
        return dp[person][i][m]=res;
    }
}