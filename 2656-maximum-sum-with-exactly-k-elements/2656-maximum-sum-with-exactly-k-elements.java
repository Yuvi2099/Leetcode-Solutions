class Solution {
    public int maximizeSum(int[] nums, int k) {
        int score=0;
        for(int i:nums) score=Math.max(score,i);
        return (score*k)+((k*(k-1))/2);
    }
}