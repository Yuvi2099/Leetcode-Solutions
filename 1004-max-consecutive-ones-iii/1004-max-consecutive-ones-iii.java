class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int count=0;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count++;
            while(count>k){
                if(nums[idx]==0) count--;
                idx++;
            }
            max=Math.max(max,i-idx+1);
        }
        return max;
    }
}