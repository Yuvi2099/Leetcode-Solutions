class Solution {
    public long gcdSum(int[] nums) {
        List<Long>l=new ArrayList<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            l.add(gcd(nums[i],max));
        }
        Collections.sort(l);
        long sum=0;
        if(l.size()%2==1) l.remove(l.size()/2);
        int n=l.size();
        for(int i=0;i<n/2;i++){
            sum+=gcd(l.get(i),l.get(n-1-i));
        }
        return sum;
    }
    private long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}