class Solution {
    public int reverseDegree(String s) {
        int sum=0,mul=1;
        for(char ch:s.toCharArray()){
            sum+=mul*(('z'-ch)+1);
            mul++;
        }
        return sum;
    }
}