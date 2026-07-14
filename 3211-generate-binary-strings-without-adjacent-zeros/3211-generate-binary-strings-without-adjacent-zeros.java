class Solution {
    public List<String> validStrings(int n) {
        List<String>l=new ArrayList<>();
        int d=(int)Math.pow(2,n);
        for(int i=0;i<d;i++){
            String x=Integer.toBinaryString(i);
            if(x.length()!=n) x=construct(x,n);
            if(valid(x)) l.add(x);
        }
        return l;
    }
    public boolean valid(String x){
        if(x.length()<2) return true;
        for(int i=1;i<x.length();i++){
            if(x.charAt(i)!='1' && x.charAt(i-1)!='1') return false;
        }
        return true;
    }
    public String construct(String x,int n){
        int len=n-x.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            sb.append("0");
        }
        sb.append(x);
        return sb.toString();
    }
}