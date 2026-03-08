class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        k=k%n;
        for(int i=nums.length-k;i<nums.length;i++){
            l.add(nums[i]);
        }
        for(int i=0;i<nums.length-k;i++){
            l.add(nums[i]);
        }
        for(int i=0;i<l.size();i++){
            nums[i]=l.get(i);
        }
    }
}