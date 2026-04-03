class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long num=n;
        long base=1;
        while(digisum(n)>target){
            n=((n/base)+1)*base;
            base=base*10;
        }
        return n-num;
    }
    static int digisum(long x){
        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }
}