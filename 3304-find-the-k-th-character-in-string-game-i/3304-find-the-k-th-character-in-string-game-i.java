class Solution {
    public char kthCharacter(int k) {
        StringBuilder word=new StringBuilder();
        word.append("a");
        while(word.length()<k){
            int len=word.length();
            for(int i=0;i<len;i++){
                char ch=word.charAt(i);
                if(ch=='z') ch='a';
                else ch++;
                word.append(ch);
            }
        }
        return word.charAt(k-1);
    }
}