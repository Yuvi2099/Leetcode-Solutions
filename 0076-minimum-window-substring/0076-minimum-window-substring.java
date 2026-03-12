class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        else if(t.length()==s.length() && t.equals(s)) return s;
        int l=s.length()-1;
        int r=s.length()-1;
        while(l!=0){
            String x=s.substring(l,r+1);
            boolean ok=true;
            for(int i=0;i<t.length();i++){
                char ch=t.charAt(i);
                if(x.indexOf(ch)==-1){
                    ok=false;
                    break;
                }
            }
            if(ok==true) return x;
            l--;
        }
        r=0;
        while(r!=s.length()){
            String x=s.substring(l,r+1);
            boolean ok=true;
            for(int i=0;i<t.length();i++){
                char ch=t.charAt(i);
                if(x.indexOf(ch)==-1){
                    ok=false;
                    break;
                }
            }
            if(ok==true) return x;
            r++;
        }
        return "";
    }
}