class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int a=0,b=1,c=1;
        int count=2;
        while(count!=n){
            a=b;
            b=c;
            c=a+b;
            count++;
        }
        return c;
    }
}