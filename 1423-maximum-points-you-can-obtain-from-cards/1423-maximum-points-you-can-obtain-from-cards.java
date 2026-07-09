class Solution {
    public int maxScore(int[] cards, int k) {
        int n=cards.length;
        int sum=0;
        for(int i:cards) sum+=i;
        int curr=0;
        for(int i=0;i<n-k;i++) curr+=cards[i];
        int max=sum-curr;
        for(int i=n-k;i<n;i++){
            curr+=cards[i];
            curr-=cards[i-n+k];
            max=Math.max(max,sum-curr);
        }
        return max;
    }
}