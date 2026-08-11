class Solution {
    Map<Integer,Boolean>m=new HashMap<>(); 
    public boolean canIWin(int max, int total) {
        int sum=(max*(max+1))/2;
        if(sum<total) return false;
        if(total<=0) return true;
        return solve(max,total,0);
    }
    private boolean solve(int max, int total, int x){
        if(total<=0) return false;
        if(m.containsKey(x)) return m.get(x);
        for(int i=1;i<=max;i++){
            int mask=1<<i;
            if((x & mask)==0){
                if(!solve(max,total-i,x|mask)){
                    m.put(x,true);
                    return true;
                }
            }
        }
        m.put(x,false);
        return false;
    }
}