class Solution {
    public int matrixSum(int[][] nums) {
        for(int[]arr:nums){
            Arrays.sort(arr);
        }
        int n=nums[0].length-1;
        int sum=0;
        for(int i=n;i>=0;i--){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<nums.length;j++){
                max=Math.max(max,nums[j][i]);
            }
            sum=sum+max;
        }
        return sum;
    }
}