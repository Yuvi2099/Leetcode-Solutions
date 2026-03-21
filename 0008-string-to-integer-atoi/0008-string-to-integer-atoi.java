class Solution {
    public int myAtoi(String s) {
        if(s.length()==0) return 0;
        int l=0,r=s.length();
        while(l<r && s.charAt(l)==' ') l++;
        int sign=1;
        if(l<r && s.charAt(l)=='+' || s.charAt(l)=='-'){
            if(s.charAt(l)=='-') sign=-1;
            else sign=1;
            l++;
        }
        long num=0;
        while(l<r && Character.isDigit(s.charAt(l))){
            num=num*10+(s.charAt(l)-'0');
            if(sign==1 && num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign==-1 && -num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            l++;
        }
        return (int)(sign*num);
    }
}