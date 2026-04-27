class Solution {
    public int sumOfUnique(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                sum=sum+nums[i];
            }
        }
        if(nums[0]!=nums[1]){
            sum=sum+nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            sum=sum+nums[nums.length-1];
        }
        return sum;
    }
}