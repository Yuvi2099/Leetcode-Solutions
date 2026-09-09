class Solution {
    public long countCommas(long n) {
        long ans=0,c=1;
        long num=1000;
        while(num<=n){
            long next=Math.min(n,num*1000-1);
            ans+=(next-num+1)*c;
            num*=1000;
            c++;
        }
        return ans;
    }
}