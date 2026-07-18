class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0],min=nums[0];
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return gcd(max,min);
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}