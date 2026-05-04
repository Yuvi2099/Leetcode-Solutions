class Solution {
    public int dominantIndex(int[] nums) {
        int largest = nums[0], largeIndex = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
                largeIndex = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if((nums[i]*2)>largest && i != largeIndex){
                return -1;
            }
        }
        return largeIndex;
    }
}