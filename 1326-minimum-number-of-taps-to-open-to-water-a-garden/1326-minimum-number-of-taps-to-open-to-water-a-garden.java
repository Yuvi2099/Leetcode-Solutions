class Solution {
    public int minTaps(int n, int[] ranges) {
        int[]arr=new int[n+1];
        for(int i=0;i<ranges.length;i++){
            int l=Math.max(0,i-ranges[i]);
            int r=Math.min(n,i+ranges[i]);
            arr[l]=Math.max(r,arr[l]);
        }
        int taps=0,curr=0,max=0;
        for(int i=0;i<n+1;i++){
            if(i>max) return -1;
            if(i>curr){
                taps++;
                curr=max;
            }
            max=Math.max(max,arr[i]);
        }
        return taps;
    }
}