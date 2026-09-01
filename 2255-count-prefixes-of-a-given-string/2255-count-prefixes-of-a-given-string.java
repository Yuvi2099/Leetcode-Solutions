class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String a=words[i];
            int l=a.length();
            if(l>s.length()) continue;
            String b=s.substring(0,l);
            if(a.equals(b)) count++;
        }
        return count;
    }
}