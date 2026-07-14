class Solution {
    public int longestBeautifulSubstring(String word) {
        int max=0,count=1,len=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)>=word.charAt(i-1)){
                len++;
                if(word.charAt(i)>word.charAt(i-1)) count++;
            }
            else{
                len=1;
                count=1;
            }
            if(count==5) max=Math.max(max,len);
        }
        return max;
    }
}