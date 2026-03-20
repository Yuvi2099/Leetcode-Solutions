class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int prod=nums[i];
            if(prod<k) count++;
            int l=i+1;
            while(l<nums.length){
                prod*=nums[l];
                if(prod>=k) break;
                count++;
                l++;
            }
        }
        return count;
    }
}