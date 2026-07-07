class Solution {
    public String removeOccurrences(String s, String part) {
        boolean ok=true;
        StringBuilder sb=new StringBuilder(s);
        while(ok){
            String x=sb.toString();
            if(x.indexOf(part)==-1) break;
            else{
                int idx=x.indexOf(part);
                int len=part.length();
                sb.setLength(0);
                sb.append(x.substring(0,idx));
                sb.append(x.substring(idx+len,x.length()));
            }
        }
        return sb.toString();
    }
}