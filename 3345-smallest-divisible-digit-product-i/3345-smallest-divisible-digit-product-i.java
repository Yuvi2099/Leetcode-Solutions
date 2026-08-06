class Solution {
    public int smallestNumber(int n, int t) {
        while(!valid(n,t)) n++;
        return n;
    }
    private boolean valid(int n, int t){
        int prod=1;
        while(n!=0){
            prod*=n%10;
            n=n/10;
        }
        return prod%t==0;
    }
}