class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++) m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        for(int i:nums){
            if(m.get(i)>n) return i;
        }
        return -1;
    }
}