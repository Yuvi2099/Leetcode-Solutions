class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String>l=new ArrayList<>();
        int d=(int)(Math.pow(2,n));
        for(int i=0;i<d;i++){
            String x=Integer.toBinaryString(i);
            if(valid(x)){
                String t=construct(x,n);
                if(cost(t,k)) l.add(t);
            }
        }
        return l;
    }
    public String construct(String x,int n){
        if(x.length()==n) return x;
        int diff=n-x.length();
        StringBuilder sb=new StringBuilder();
        while(diff!=0){
            sb.append("0");
            diff--;
        }
        sb.append(x);
        return sb.toString();
    }
    public boolean valid(String x){
        for(int i=1;i<x.length();i++){
            if(x.charAt(i)=='1' && x.charAt(i)==x.charAt(i-1)) return false;
        }
        return true;
    }
    public boolean cost(String x,int k){
        int sum=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='1') sum+=i;
        }
        return sum<=k;
    }
}