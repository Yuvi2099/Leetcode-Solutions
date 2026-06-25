class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums1) h.add(i);
        int min=0;
        for(int i=0;i<nums2.length;i++){
            if(h.contains(nums2[i])){
                if(min==0) min=nums2[i];
                else min=Math.min(min,nums2[i]);
            }
        }
        if(min==0) return -1;
        return min; 
    }
}