class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int l=0;
        int r=k-1;
        while(r<nums.length){
            min=Math.min(min,nums[r]-nums[l]);
            r++;
            l++;
        }
        return min;
    }
}