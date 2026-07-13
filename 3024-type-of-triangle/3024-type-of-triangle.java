class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        int count=0;
        if(a==b) count++;
        if(b==c) count++;
        if(a==c) count++;
        if(a+b<=c || b+c<=a || a+c<=b) return "none";
        else if(count==3) return "equilateral";
        else if(count==1) return "isosceles";
        return "scalene";
    }
}