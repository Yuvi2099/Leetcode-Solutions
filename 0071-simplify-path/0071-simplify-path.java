class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/'){
                if(sb.length()>0){
                    processDots(st,sb.toString());
                    sb.setLength(0);
                }
            }
            else sb.append(path.charAt(i));
        }
        if(sb.length()>0) processDots(st,sb.toString());
        if(st.isEmpty()) return "/";
        StringBuilder ans=new StringBuilder();
        for(String s:st) ans.append("/").append(s);
        return ans.toString();
    }
    private void processDots(Stack<String> st, String x){
        if(x.equals("..")){
            if(!st.isEmpty()) st.pop();
        }
        else if(!x.equals(".")) st.push(x);
    }
}