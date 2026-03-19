class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int max=nums[0];
        int[]prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
            max=Math.max(max,nums[i]);
        }
        if(k==1) return prefix[n-1];
        else if(k==n) return max;
        int l=max,r=prefix[n-1];
        int ans=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(split(nums,k,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    private boolean split(int[]nums, int k, int limit){
        int count=1;
        int sum=0;
        for(int i:nums){
            if(sum+i>limit){
                count++;
                sum=i;
                if(count>k) return false;
            }
            else sum+=i;
        }
        return true;
    }
}