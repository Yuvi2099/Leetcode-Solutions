class Solution {
    public String maximumXor(String s, String t) {
        int[]f=new int[2];
        for(char ch:t.toCharArray()){
            if(ch=='0') f[0]++;
            else f[1]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(f[1]>0){
                    sb.append("1");
                    f[1]--;
                }
                else{
                    sb.append("0");
                    f[0]--;
                }
            }
            else{
                if(f[0]>0){
                    sb.append("0");
                    f[0]--;
                }
                else{
                    sb.append("1");
                    f[1]--;
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