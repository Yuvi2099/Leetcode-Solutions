class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count=0;
        Arrays.sort(strs);
        int l=strs[0].length();
        while(l>0){
            if(strs[0].charAt(count)==strs[strs.length-1].charAt(count)){
                count++;
                l--;
            }
            else{
                break;
            }
        }
        return count==0?"":strs[0].substring(0,count);
        
    }
}