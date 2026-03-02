class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]arr=new int[2];
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(m.containsKey(x)){
                arr[0]=m.get(x);
                arr[1]=i;
                return arr;
            }
            m.put(nums[i],i);
        }
        return arr;
    }
}