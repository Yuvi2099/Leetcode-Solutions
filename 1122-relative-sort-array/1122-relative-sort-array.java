class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[]freq=new int[1001];
        for(int i:arr1) freq[i]++;
        int[]result=new int[arr1.length];
        int idx=0;
        for(int i:arr2){
            while(freq[i]>0){
                result[idx]=i;
                freq[i]--;
                idx++;
            }
        }
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                result[idx]=i;
                freq[i]--;
                idx++;
            }
        }
        return result;
    }
}