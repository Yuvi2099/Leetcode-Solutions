class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        String[] arr=new String[n];
        arr=s.split(" ");
        return arr[arr.length-1].length(); 
    }
}