class Solution {
    public String largestOddNumber(String num) {
        int idx=-1;
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            if(ch=='1' || ch=='3' || ch=='5' || ch=='7' || ch=='9'){
                idx=i+1;
                break;
            }
        }
        if(idx==-1) return "";
        return num.substring(0,idx);
    }
}