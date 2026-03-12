class Solution {
    public int compress(char[] chars) {
        if(chars.length==1) return 1;
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }
            else{
                if(count==1) sb.append(chars[i]);
                else{
                    sb.append(chars[i]);
                    sb.append(count);
                    count=1;
                }
            }
        }
        if(chars[chars.length-1]==chars[chars.length-2]){
            sb.append(chars[chars.length-1]);
            sb.append(count);
        }
        else{
            sb.append(chars[chars.length-1]);
        }
        String x=sb.toString();
        for(int i=0;i<x.length();i++){
            chars[i]=x.charAt(i);
        }
        return x.length();
    }
}