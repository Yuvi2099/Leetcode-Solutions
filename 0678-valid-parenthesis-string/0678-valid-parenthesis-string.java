class Solution {
    public boolean checkValidString(String s) {
        int l=0,r=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                l++;
                r++;
            }
            else if(ch==')'){
                if(l>0) l--;
                r--;
            }
            else if(ch=='*'){
                if(l>0) l--;
                r++;
            }
            if(r<0) return false; 
        }
        return l==0;
    }
}