class Solution {
    public boolean split(int[] nums, int limit, int k){
        int count=1;
        int sum=0;
        for(int i:nums){
            if((sum+i)>limit){
                count++;
                sum=i;
            }
            else sum+=i;
        }
        return count<=k;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int min=Integer.MIN_VALUE;
        if(n<k) return 0;
        for(int i:nums){
            min=Math.max(min,i);
            max+=i;
        }
        int ans=0;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(split(nums,mid,k)){
                ans=mid;
                max=mid-1;
            }
            else min=mid+1;
        }
        return ans;
    }
}