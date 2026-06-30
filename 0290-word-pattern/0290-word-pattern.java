class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[]srr=s.split(" ");
        if(pattern.length()!=srr.length) return false;
        HashMap<Character,String>m1=new HashMap<>();
        HashMap<String,Character>m2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=srr[i];
            if(m1.containsKey(ch)){
                if(!m1.get(ch).equals(word)) return false;
            }
            else m1.put(ch,word);
            if(m2.containsKey(word)){
                if(m2.get(word)!=ch) return false;
            }
            else m2.put(word,ch);
        }
        return true;
    }
}