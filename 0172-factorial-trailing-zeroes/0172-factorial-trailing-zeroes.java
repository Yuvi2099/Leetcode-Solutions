class Solution {
    public int trailingZeroes(int n) {
        int x=5;
        int ans=0;
        int i=1;
        while(x<=n){
            ans=ans+(n/x);
            i++;
            x=(int)Math.pow(5,i);
        }
        return ans;
    }
}