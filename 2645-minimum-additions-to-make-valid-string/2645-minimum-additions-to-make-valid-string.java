class Solution {
    public int addMinimum(String word) {
        int ops=0;
        char ch='a';
        for(char c:word.toCharArray()){
            while(ch!=c){
                ops++;
                if(ch=='a') ch='b';
                else if(ch=='b') ch='c';
                else ch='a';
            }
            if(ch=='a') ch='b';
            else if(ch=='b') ch='c';
            else ch='a';
        }
        if(ch=='b') ops+=2;
        else if(ch=='c') ops++;
        return ops;
    }
}