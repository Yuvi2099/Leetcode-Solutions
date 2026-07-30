class Solution {
    public int minimumPushes(String word) {
        HashSet<Character>h=new HashSet<>();
        for(char ch:word.toCharArray()) h.add(ch);
        int limit=h.size();
        int mul=1;
        int ops=0;
        for(int i=1;i<=limit;i++){
            ops+=mul;
            if(i%8==0) mul++;
        }
        return ops;
    }
}