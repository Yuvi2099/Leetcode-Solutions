class Solution {
    int max=0;
    public int maxUniqueSplit(String s) {
        solve(s,0,new HashSet<>());
        return max;
    }
    private void solve(String s, int l, HashSet<String>h){
        if(l==s.length()){
            max=Math.max(max,h.size());
            return;
        }
        for(int r=l+1;r<=s.length();r++){
            String x=s.substring(l,r);
            if(!h.contains(x)){
                h.add(x);
                solve(s,r,h);
                h.remove(x);
            }
        }
    }
}