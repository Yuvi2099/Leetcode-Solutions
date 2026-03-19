class Solution {
    private Map<String,Double>m=new HashMap<>();
    private final int[][] ways={
        {1,2},{1,-2},{2,1},{2,-1},{-1,2},{-1,-2},{-2,1},{-2,-1}
    };
    private double solve(int n,int k,int row,int col){
        if(row<0 || row>=n || col<0 || col>=n) return 0.0;
        if(k==0) return 1.0;
        String key=k+"_"+row+"_"+col;
        if(m.containsKey(key)) return m.get(key);
        double ans=0.0;
        for(int[]w:ways){
            int r=row+w[0];
            int c=col+w[1];
            ans+=solve(n,k-1,r,c);
        }
        double res=ans/8.0;
        m.put(key,res);
        return res;
    }
    public double knightProbability(int n, int k, int row, int col) {
        return solve(n,k,row,col);
    }
}