class Solution {
    public int maxProductDifference(int[] nums) {
        int max1=0,min1=10001;
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min1){
                min1=nums[i];
                j=i;
            }
            else if(nums[i]>max1){
                max1=nums[i];
                k=i;
            }
        }
        int max2=0,min2=10001;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max2 && i!=k) max2=nums[i];
            if(nums[i]<min2 && i!=j) min2=nums[i];
        }
        return max1*max2-min1*min2;
    }
}