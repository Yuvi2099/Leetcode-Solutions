class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int[]arr=new int[3];
        int count=0,l=0;
        for(int r=0;r<n;r++){
            arr[s.charAt(r)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                count+=(n-r);
                arr[s.charAt(l)-'a']--;
                l++;
            }
        }
        return count;
    }
}