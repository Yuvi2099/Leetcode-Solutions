class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])==false){
                m.put(nums[i],1);
            }
            else{
                m.replace(nums[i],m.get(nums[i])+1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(m.get(nums[i])==1){
                res=nums[i];
            }
        }
        return res;
    }
}