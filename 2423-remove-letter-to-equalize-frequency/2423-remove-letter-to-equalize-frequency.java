class Solution {
    public boolean equalFrequency(String word) {
        int[]freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0) continue;
            freq[i]--;
            if(valid(freq)) return true;
            freq[i]++;
        }
        return false;
    }
    private boolean valid(int[]freq){
        int c=0;
        for(int i:freq){
            if(i==0) continue;
            if(c==0) c=i;
            else if(i!=c) return false;
        }
        return true;
    }
}