class Solution {
    public boolean isBalanced(String num) {
        int osum=0;
        int esum=0;
        for(int i=0;i<num.length();i++){
            int x=Character.getNumericValue(num.charAt(i));
            if(i%2==0){
                esum=esum+x;
            }
            else{
                osum=osum+x;
            }
        }
        if(esum==osum){
            return true;
        }
        else{
            return false;
        }
    }
}