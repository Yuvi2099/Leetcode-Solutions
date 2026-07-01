class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(String x:strs){
            int count=0;
            for(int i=0;i<x.length();i++){
                char ch=x.charAt(i);
                if(ch>='a' && ch<='z'){
                    count++;
                    break;
                }
            }
            int len=0;
            if(count==0) len=Integer.parseInt(x);
            else len=x.length();
            max=Math.max(max,len);
        }
        return max;
    }
}