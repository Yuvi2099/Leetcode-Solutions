class Solution {
    public int arraySign(int[] nums) {
        int prod=1;
        for(int i:nums){
            int x=signFunc(i);
            if(x==0) return 0;
            else prod*=x;
        }
        return prod;
    }
    private int signFunc(int x){
        if(x==0) return 0;
        else if(x>0) return 1;
        return -1;
    }
}