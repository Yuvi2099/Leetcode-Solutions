class Solution {
    public int minimumCost(int[] nums) {
        int min=51;
        int id1=0;
        int id2=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                id1=i;
            }
        }
        min=51;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i] && i!=id1){
                min=nums[i];
                id2=i;
            }
        }
        int cost=nums[id1]+nums[id2];
        for(int i=0;i<nums.length;i++){
            if(i!=id1 && i!=id2){
                cost=cost+nums[i];
                break;
            }
        }
        return cost;
    }
}