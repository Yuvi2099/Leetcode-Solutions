class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums3=new int[m+n];
        for(int i=0,j=0,k=0;true;){
            if(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    nums3[k]=nums1[i];
                    i++;
                }
                else{
                    nums3[k]=nums2[j];
                    j++;
                }
            }
            else if(i<m){
                nums3[k]=nums1[i];
                i++;
            }
            else if(j<n){
                nums3[k]=nums2[j];
                j++;
            }
            else{
                break;
            }
            k++;
        }
        int x=nums3.length/2;
        if(nums3.length%2==0){
            double res=(double)nums3[x]+(double)nums3[x-1];
            return res/2;
        }
        return (double)nums3[x];
    }
}