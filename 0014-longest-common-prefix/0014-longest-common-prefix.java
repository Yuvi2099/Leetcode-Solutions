class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String x=strs[0];
        String y=strs[strs.length-1];
        int idx=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==y.charAt(i)){
                idx++;
            }
            else{
                break;
            }
        }
        return x.substring(0,idx);
    }
}