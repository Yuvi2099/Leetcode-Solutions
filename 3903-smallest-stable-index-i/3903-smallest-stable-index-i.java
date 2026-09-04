class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<nums[i]) max=nums[i];
            int min=findMin(i,nums);
            int diff=max-min;
            if(diff<=k) return i;
        }
        return -1;
    }
    private int findMin(int i, int[] nums){
        int min=Integer.MAX_VALUE;
        for(int j=i;j<nums.length;j++) min=Math.min(min,nums[j]);
        return min;
    }
}