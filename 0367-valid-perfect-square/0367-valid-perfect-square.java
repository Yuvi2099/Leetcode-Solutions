class Solution {
    public boolean isPerfectSquare(int num) {
        int prod=0;
        boolean res=false;
        int n=(int)Math.sqrt(num);
        for(int i=1;i<=n;i++){
            prod=i*i;
            if(prod==num){
                res=true;
                break;
            }
        }
        return res;
    }
}