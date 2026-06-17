class Solution {
    public int findSpecialInteger(int[] arr) {
        int freq=arr.length/4;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+freq]) return arr[i];
        }
        return -1;
    }
}