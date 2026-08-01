class Solution {
    public boolean predictTheWinner(int[] nums) {
        int total=0;
        for(int i:nums) total+=i;
        int p1=solve(0,nums.length-1,nums);
        int p2=total-p1;
        return p1>=p2;
    }
    private int solve(int i, int j, int[]nums){
        if(i>j) return 0;
        if(i==j) return nums[i];
        int a=nums[i]+Math.min(solve(i+1,j-1,nums),solve(i+2,j,nums));
        int b=nums[j]+Math.min(solve(i,j-2,nums),solve(i+1,j-1,nums));
        return Math.max(a,b);
    }
}