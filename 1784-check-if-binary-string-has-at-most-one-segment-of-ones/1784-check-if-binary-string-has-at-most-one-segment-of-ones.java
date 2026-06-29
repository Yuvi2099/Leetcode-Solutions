class Solution {
    public boolean checkOnesSegment(String s) {
        boolean ok=true;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                if(ok==false) return false;
            }
            else ok=false;
        }
        return true;
    }
}