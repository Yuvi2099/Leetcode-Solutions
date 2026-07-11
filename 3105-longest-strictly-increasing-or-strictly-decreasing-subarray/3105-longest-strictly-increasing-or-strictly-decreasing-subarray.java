class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int inc=1,dec=1;
        int max=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) inc++;
            else{
                max=Math.max(max,inc);
                inc=1;
            }
        }
        max=Math.max(max,inc);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) dec++;
            else{
                max=Math.max(max,dec);
                dec=1;
            }
        }
        max=Math.max(max,dec);
        return max;
    }
}