class Solution {
    public boolean judgeCircle(String moves) {
        int h=0,v=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L' || ch=='R'){
                if(ch=='R') v++;
                else v--;
            }
            else if(ch=='U' || ch=='D'){
                if(ch=='U') h++;
                else h--;
            }
        }
        return (v==0 && h==0);
    }
}