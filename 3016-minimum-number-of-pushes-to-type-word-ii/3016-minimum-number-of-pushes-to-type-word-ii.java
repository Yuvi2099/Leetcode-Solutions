class Solution {
    public int minimumPushes(String word) {
        int[]freq=new int[26];
        for(char ch:word.toCharArray()) freq[ch-'a']++;
        Arrays.sort(freq);
        int ops=0,idx=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==0) break;
            if(idx<8) ops+=freq[i];
            else if(idx<16) ops+=freq[i]*2;
            else if(idx<24) ops+=freq[i]*3;
            else ops+=freq[i]*4;
            idx++;
        }
        return ops;
    }
}