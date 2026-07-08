class Solution {
    public String resultingString(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(sb.length()>0){
                char dh=sb.charAt(sb.length()-1);
                if((dh=='z' && ch=='a') || (dh=='a' && ch=='z') || Math.abs(dh-ch)==1){
                    sb.deleteCharAt(sb.length()-1);
                    continue;
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}