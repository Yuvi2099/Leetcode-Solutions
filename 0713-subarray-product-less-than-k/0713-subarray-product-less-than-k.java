class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod=nums[i];
            int j=i+1;
            while(prod<k){
                count++;
                if(j==nums.length) break;
                prod*=nums[j];
                j++;
            }
        }
        return count;
    }
}