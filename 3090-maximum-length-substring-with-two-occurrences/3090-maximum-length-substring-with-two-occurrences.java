class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int[]freq=new int[26];
        int len=0,l=0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            freq[ch-'a']++;
            while(freq[ch-'a']>2){
                char dh=s.charAt(l);
                freq[dh-'a']--;
                l++;
            }
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}