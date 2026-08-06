class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int[][]dp=new int[n][2];
        for(int i=0;i<n;i++){
            dp[i][0]=nums1[i];
            dp[i][1]=nums2[i];
        }
        Arrays.sort(dp,(a,b)->b[1]-a[1]);
        PriorityQueue<Integer>h=new PriorityQueue<>();
        long sum=0,ans=0;
        for(int i=0;i<n;i++){
            h.offer(dp[i][0]);
            sum+=dp[i][0];
            if(h.size()>k) sum-=h.poll();
            if(h.size()==k) ans=Math.max(ans,sum*dp[i][1]);
        }
        return ans;
    }
}