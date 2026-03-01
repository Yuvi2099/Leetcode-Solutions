class Solution {
    public int minPartitions(String n) {
        int max=0;
        int len=n.length();
        if(len==1){
            return n.charAt(0)-'0';
        }
        for(int i=0;i<len;i++){
            char ch=n.charAt(i);
            if(max<ch-'0'){
                max=ch-'0';
            }
        }
        // if(max<n.charAt(0)-'0'){
        //     return n.charAt(0)-'0';
        // }
        return max;
    }
}