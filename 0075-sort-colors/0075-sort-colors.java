class Solution {
    public void sortColors(int[] nums) {
        int r=0;
        int w=0;
        int b=0;
        for(int i:nums){
            if(i==0){
                r++;
            }
            else if(i==1){
                w++;
            }
            else{
                b++;
            }
        }
        for(int i=0;i<r;i++){
            nums[i]=0;
        }
        for(int i=r;i<r+w;i++){
            nums[i]=1;
        }
        for(int i=r+w;i<nums.length;i++){
            nums[i]=2;
        }
    }
}