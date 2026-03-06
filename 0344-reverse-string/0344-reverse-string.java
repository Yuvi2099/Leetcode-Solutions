class Solution {
    public void reverseString(char[] s) {
        List<Character>l=new ArrayList<>();
        for(char ch:s){
            l.add(ch);
        }
        int idx=0;
        for(int i=l.size()-1;i>=0;i--){
            s[idx]=l.get(i);
            idx++;
        }
    }
}