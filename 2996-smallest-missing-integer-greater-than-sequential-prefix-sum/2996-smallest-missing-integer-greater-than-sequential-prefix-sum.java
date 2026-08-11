class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1) return nums[0]+1;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) sum+=nums[i];
            else break;
        }
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums) h.add(i);
        while(h.contains(sum)) sum++;
        return sum;
    }
}