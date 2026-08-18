class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int[]freq=new int[51];
        for(int i=0;i<=n-k;i++){
            HashSet<Integer>h=new HashSet<>();
            for(int j=i;j<i+k;j++) h.add(nums[j]); 
            for(int x:h) freq[x]++;
        }
        for(int i=50;i>=0;i--){
            if(freq[i]==1) return i;
        }
        return -1;
    }
}