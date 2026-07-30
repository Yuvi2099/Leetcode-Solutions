class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int mul=1;
        int ops=0;
        for(int i=1;i<=n;i++){
            ops+=mul;
            if(i%8==0) mul++;
        }
        return ops;
    }
}