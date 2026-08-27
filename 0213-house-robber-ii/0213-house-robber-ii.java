class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[]dp1=new int[n];
        dp1[0]=nums[0];
        for(int i=1;i<=n-2;i++){
            int take=nums[i]+(i>=2?dp1[i-2]:0);
            int skip=dp1[i-1];
            dp1[i]=Math.max(take,skip);
        }
        int[]dp2=new int[n];
        dp2[1]=nums[1];
        for(int i=2;i<=n-1;i++){
            int take=nums[i]+dp2[i-2];
            int skip=dp2[i-1];
            dp2[i]=Math.max(take,skip);
        }
        return Math.max(dp1[n-2],dp2[n-1]);
    }
}