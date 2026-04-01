class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0,max=0;
        int l=0;int r=tokens.length-1;
        Arrays.sort(tokens);
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                score++;
                l++;
                max=Math.max(max,score);
            }
            else if(score>=1){
                power+=tokens[r];
                score--;
                r--;
            }
            else return max;
        }
        return max;
    }
}