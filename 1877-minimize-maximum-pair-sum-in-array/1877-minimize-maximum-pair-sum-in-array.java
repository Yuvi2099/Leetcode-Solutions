class Solution {
    public int minPairSum(int[] nums) {
        List<Integer>h=new ArrayList<>();
        int l=0;
        int r=nums.length-1;
        Arrays.sort(nums);
        while(l<r){
            h.add(nums[l]+nums[r]);
            l++;
            r--;
        }
        int max=0;
        for(int i=0;i<h.size();i++){
            max=Math.max(max,h.get(i));
        }
        return max;
    }
}