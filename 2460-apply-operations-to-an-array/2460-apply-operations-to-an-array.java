class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        List<Integer>l=new ArrayList<>();
        List<Integer>z=new ArrayList<>();
        for(int i:nums){
            if(i==0) z.add(i);
            else l.add(i);
        }
        l.addAll(z);
        int[]arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}