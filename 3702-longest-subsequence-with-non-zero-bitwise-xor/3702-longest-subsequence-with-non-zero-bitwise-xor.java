class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int x=0,z=0;
        for(int i:nums){
            x^=i;
            if(i==0) z++;
        }
        if(z==n) return 0;
        else if(x==0) return n-1;
        return n;
    }
}