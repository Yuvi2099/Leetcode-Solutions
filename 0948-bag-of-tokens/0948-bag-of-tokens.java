class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int max=0,score=0;
        int l=0,r=tokens.length-1;
        while(l<=r){
            if(power>=tokens[l]){
                score++;
                power-=tokens[l];
                l++;
                max=Math.max(max,score);
            }
            else{
                if(score>0){
                    power+=tokens[r];
                    r--;
                    score--;
                    max=Math.max(max,score);
                }
                else return max;
            }
        }
        return max;
    }
}