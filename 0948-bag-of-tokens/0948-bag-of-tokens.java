class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0,max=0;
        int l=0,r=tokens.length-1;
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                l++;
                score++;
                max=Math.max(max,score);
            }
            else if(score>=1){
                power+=tokens[r];
                r--;
                score--;
            }
            else return max;
        }
        return max;
    }
}