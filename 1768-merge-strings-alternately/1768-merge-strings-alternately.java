class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int len=Math.min(word1.length(),word2.length());
        int w=0;
        if(word1.length()>word2.length()) w=1;
        else if(word2.length()>word1.length()) w=2;
        for(int i=0;i<len;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(w==1) sb.append(word1.substring(len,word1.length()));
        else if(w==2) sb.append(word2.substring(len,word2.length()));
        return sb.toString();
    }
}