class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>h=new HashSet<>();
        while(n!=1 && !h.contains(n)){
            h.add(n);
            int num=0;
            while(n>0){
                int d=n%10;
                num+=d*d;
                n/=10;
            }
            n=num;
        }
        return n==1;
    }
}