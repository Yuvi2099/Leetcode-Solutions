class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        String[] arr=new String[n];
        arr=s.split(" ");
        int q=arr.length;
        int p=arr[q-1].length();
        return p; 
    }
}