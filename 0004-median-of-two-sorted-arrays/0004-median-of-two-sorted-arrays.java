class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums3=new int[m+n];
        double res=0;
        for(int i=0;i<m;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            nums3[m+i]=nums2[i];
        }
        Arrays.sort(nums3);
        if(nums3.length%2==0){
            int o=nums3.length/2;
            double a=(double)nums3[o-1];
            double b=(double)nums3[o];
            res=(a+b)/2;
        }
        else{
            int o=(nums3.length/2);
            double a=(double)nums3[o];
            res=a;
        }
        return res;
    }
}