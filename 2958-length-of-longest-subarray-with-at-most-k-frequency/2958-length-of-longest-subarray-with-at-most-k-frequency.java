class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>m=new HashMap<>();
        int l=0,max=0;
        for(int r=0;r<n;r++){
            m.put(nums[r],m.getOrDefault(nums[r],0)+1);
            while(m.get(nums[r])>k){
                m.put(nums[l],m.get(nums[l])-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}