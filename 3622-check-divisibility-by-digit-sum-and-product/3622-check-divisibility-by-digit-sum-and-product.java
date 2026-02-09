class Solution {
    public boolean checkDivisibility(int n) {
        String s=String.valueOf(n);
        char[]arr=s.toCharArray();
        int sum=0;
        int prod=1;
        for(int i=0;i<arr.length;i++){
            int x=arr[i]-'0';
            sum=sum+x;
            prod=prod*x;
        }
        if(n%(sum+prod)==0){
            return true;
        }
        return false;
    }
}