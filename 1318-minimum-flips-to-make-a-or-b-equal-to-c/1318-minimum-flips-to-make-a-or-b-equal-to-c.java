class Solution {
    public int minFlips(int a, int b, int c) {
        String x=Integer.toBinaryString(a);
        String y=Integer.toBinaryString(b);
        String z=Integer.toBinaryString(c);

        int max=0,len=z.length();
        max=Math.max(a,Math.max(b,c));

        if(max==a) len=x.length();
        else if(max==b) len=y.length();

        x=construct(x,len-x.length());
        y=construct(y,len-y.length());
        z=construct(z,len-z.length());

        int count=0;
        for(int i=len-1;i>=0;i--){
            char ah=x.charAt(i);
            char bh=y.charAt(i);
            char ch=z.charAt(i);
            if(ch=='0'){
                if(ah!='0') count++;
                if(bh!='0') count++;
            }
            else{
                if((ah=='1' && bh=='0') || (ah=='0' && bh=='1')) continue;
                else if(ah==bh && ah=='0') count++;
            }
        }
        return count;
    }
    public String construct(String s, int n){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++) sb.append("0");
        sb.append(s);
        return sb.toString();
    }
}