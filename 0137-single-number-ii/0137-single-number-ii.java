class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],(m.getOrDefault(nums[i],0)+1));
            h.add(nums[i]);
        }
        for(int i:h){
            if(m.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}