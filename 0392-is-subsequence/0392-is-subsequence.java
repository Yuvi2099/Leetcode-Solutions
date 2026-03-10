class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        if(n==0) return true;
        int count=0;
        int i=0;
        for(int j=0;j<t.length();j++){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                count++;
                if(i==n) break;
            }
        }
        if(count==n) return true;
        return false;
    }
}