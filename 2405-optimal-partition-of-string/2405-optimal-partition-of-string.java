class Solution {
    public int partitionString(String s) {
        StringBuilder sb=new StringBuilder();
        int ans=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(sb.indexOf(String.valueOf(ch))==-1) sb.append(ch);
            else{
                ans++;
                sb.setLength(0);
                sb.append(ch);
            }
        }
        return ans;
    }
}