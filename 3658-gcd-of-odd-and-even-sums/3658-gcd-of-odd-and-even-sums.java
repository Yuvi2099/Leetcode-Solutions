class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0,even=0;
        int i=1,j=2;
        while(n!=0){
            odd+=i;
            even+=j;
            i+=2;
            j+=2;
            n--;
        }
        int d=Math.min(odd,even);
        int gcd=1;
        for(int p=2;p<=d;p++){
            if(odd%p==0 && even%p==0) gcd=p;
        }
        return gcd;
    }
}