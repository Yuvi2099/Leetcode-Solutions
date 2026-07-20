class Solution {
    public long sumOfLargestPrimes(String s) {
        HashSet<Long>h=new HashSet<>();
        for(int i=0;i<s.length();i++){
            long num=0;
            for(int j=i;j<s.length() && j-i<18;j++){
                num=num*10+(s.charAt(j)-'0');
                h.add(num);
            }
        }
        PriorityQueue<Long>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(long x:h) if(isPrime(x)) pq.add(x);
        long sum=0;
        for(int i=0;i<3 && !pq.isEmpty();i++){
            sum+=pq.poll();
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