class Solution {
    public boolean isThree(int n) {
        if(n==1 || n==2 || n==3 || n==5 || n==7) return false;
        else if(n==4) return true;
        else if(n%2==0) return false;
        boolean ok=false;
        int i=2;
        int count=0;
        while(i<n/2){
            if(n%i==0){
                if(ok==false){
                    ok=true;
                    count++;
                }
                else return false;
            }
            i++;
        }
        return count==1;
    }
}