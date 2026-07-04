class Solution {
    public int monotoneIncreasingDigits(int n) {
        String s=String.valueOf(n);
        char[]arr=s.toCharArray();
        int p=arr.length;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]<arr[i-1]){
                arr[i-1]--;
                p=i;
            }
        }
        for(int i=p;i<arr.length;i++) arr[i]='9';
        return Integer.parseInt(new String(arr));
    }
}