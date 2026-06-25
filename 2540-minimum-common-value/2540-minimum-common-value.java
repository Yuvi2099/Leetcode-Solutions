class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums1) h.add(i);
        for(int i=0;i<nums2.length;i++){
            if(h.contains(nums2[i])) return nums2[i];
        }
        return -1;
    }
}