class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.substring(i,n));
            sb.append(s.substring(0,i));
            if(sb.toString().equals(goal)) return true;
            sb.setLength(0);
        }
        return false;
    }
}