class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int m=n/3;
        int[][]arr=new int[m][3];
        int j=0;
        for(int i=0;i<n;i+=3){
            if(nums[i+1]-nums[i]<=k && nums[i+2]-nums[i]<=k){
                arr[j][0]=nums[i];
                arr[j][1]=nums[i+1];
                arr[j][2]=nums[i+2];
                j++;
            }
            else return new int[0][0];
        }
        return arr;
    }
}