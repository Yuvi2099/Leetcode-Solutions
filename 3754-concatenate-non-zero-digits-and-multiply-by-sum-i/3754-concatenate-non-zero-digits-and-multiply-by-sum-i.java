class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        char[]arr=s.toCharArray();
        long sum=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:arr){
            if(ch!='0'){
                sb.append(ch);
                int x=Integer.parseInt(String.valueOf(ch));
                sum+=x;
            }
        }
        if(sb.length()==0) return 0;
        long res=Long.parseLong(sb.toString());
        res*=sum;
        return res;
    }
}