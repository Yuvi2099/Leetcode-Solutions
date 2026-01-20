class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        int max=nums[nums.length-1];
        int min=nums[0];
        List<Integer>l=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(h.contains(i)==false){
                l.add(i);
            }
        }
        return l;
    }
}