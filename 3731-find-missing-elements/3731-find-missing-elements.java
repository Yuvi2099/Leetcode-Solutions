class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=1;
        int min=101;
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        List<Integer>l=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(h.contains(i)==false){
                l.add(i);
            }
        }
        return l;
    }
}