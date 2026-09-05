class Solution {
    public String maximumXor(String s, String t) {
        int a=0,b=0;
        for(char ch:t.toCharArray()){
            if(ch=='0') a++;
            else b++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(b>0){
                    sb.append("1");
                    b--;
                }
                else{
                    sb.append("0");
                    a--;
                }
            }
            else{
                if(a>0){
                    sb.append("0");
                    a--;
                }
                else{
                    sb.append("1");
                    b--;
                }
            }
        }
        String r=sb.toString();
        StringBuilder tb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'0';
            int y=r.charAt(i)-'0';
            tb.append(x^y);
        }
        return tb.toString();
    }
}