class Solution {
    public int jump(int[] nums) {
        int count=0;
        int curr=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i==curr){
                count++;
                curr=max;
            }
        }
        return count;
    }
}
