class Solution {
    public boolean checkOnesSegment(String s) {
        boolean ok=true;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                if(ok==false) return false;
            }
            else ok=false;
        }
        return true;
    }
}