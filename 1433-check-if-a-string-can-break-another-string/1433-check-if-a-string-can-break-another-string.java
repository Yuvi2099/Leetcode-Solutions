class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[]arr=s1.toCharArray();
        char[]brr=s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        boolean ans=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>brr[i]){
                ans=false;
                break;
            }
        }
        if(ans) return ans;
        for(int i=0;i<arr.length;i++){
            if(brr[i]>arr[i]) return false;
        }
        return true;
    }
}