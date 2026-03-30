class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int idxmax=0,idxmin=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idxmax=i;
            }
            if(nums[i]<min){
                min=nums[i];
                idxmin=i;
            }
        }
        if(idxmin>idxmax){
            int temp=idxmin;
            idxmin=idxmax;
            idxmax=temp;
        }
        int l=idxmax+1;
        int r=n-idxmin;
        int mid=(idxmin+1)+(n-idxmax);
        return Math.min(l,Math.min(r,mid));
    }
}