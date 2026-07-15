class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0,even=0;
        for(int i=1;i<=n;i++){
            odd+=i*2-1;
            even+=i*2;
        }
        int d=Math.min(odd,even);
        int gcd=1;
        for(int i=d;i>=2;i--){
            if(odd%i==0 && even%i==0) return i;
        }
        return 1;
    }
}