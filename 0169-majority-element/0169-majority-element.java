class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        if(nums.length==1 || nums.length==2){
            return nums[0];
        }
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.replace(nums[i],m.get(nums[i])+1);
                if(m.get(nums[i])>n){
                    return nums[i];
                }
            }
            else{
                m.put(nums[i],1);
            }
        }
        return -1;
    }
}