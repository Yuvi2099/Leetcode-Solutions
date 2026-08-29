class Solution {
    public int maximizeSum(int[] nums, int k) {
        int score=0,n=0;
        for(int i:nums) n=Math.max(n,i);
        while(k!=0){
            score+=n;
            n++;
            k--;
        }
        return score;
    }
}