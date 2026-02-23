class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n;
        for(int i=0;i<m;i++){
            nums1[i]=nums1[i];
        }
        for(int i=m;i<k;i++){
            nums1[i]=nums2[Math.abs(m-i)];
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}