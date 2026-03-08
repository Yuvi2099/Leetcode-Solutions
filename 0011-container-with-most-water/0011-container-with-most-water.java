class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int area=Math.min(height[l],height[r]) * (r-l);  //determining length and breadth
            max=Math.max(max,area);
            if(height[l]<height[r]){ //since smaller length leads to more blocks for volume
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}