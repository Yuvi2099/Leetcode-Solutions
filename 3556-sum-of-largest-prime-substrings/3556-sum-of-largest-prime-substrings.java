class Solution {
    public long sumOfLargestPrimes(String s) {
        List<Long>l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                long x=Long.parseLong(sb.toString());
                if(!l.contains(x)) l.add(x);
            }
        }
        Collections.sort(l);
        int idx=l.size()-1;
        int k=3;
        long sum=0;
        while(idx>=0 && k>0){
            if(isPrime(l.get(idx))){
                sum+=l.get(idx);
                k--;
            }
            idx--;
        }
        return sum;
    }
    private boolean isPrime(long x){
        if(x<2) return false;
        if(x%2==0) return x==2;
        if(x%3==0) return x==3;
        int n=(int)Math.sqrt(x);
        for(int i=5;i<=n;i++){
            if(x%i==0 && x!=i) return false;
        }
        return true;
    }
}