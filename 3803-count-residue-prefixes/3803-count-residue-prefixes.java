class Solution {
    public int residuePrefixes(String s) {
        int count=0;
        HashSet<Character>h=new HashSet<>();
        int len=0;
        for(int i=0;i<s.length();i++){
            h.add(s.charAt(i));
            if(h.size()==(i+1)%3) count++;
        }
        return count;
    }
}