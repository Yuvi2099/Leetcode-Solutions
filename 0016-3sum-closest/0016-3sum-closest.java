class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(i!=j && j!=k && k!=i){
                        int sum=nums[i]+nums[j]+nums[k];
                        if(Math.abs(sum-target)<diff){
                            diff=Math.abs(sum-target);
                            ans=sum;
                        }
                    }
                }
            }
        }
        return ans;
    }
}