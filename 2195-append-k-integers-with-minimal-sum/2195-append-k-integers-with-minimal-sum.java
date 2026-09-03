class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum=0,j=1;
        for(int i:nums){
            if(i>j){
                long c=Math.min(k,i-j);
                sum+=(j+j+c-1)*c/2;
                k-=c;
            }
            j=(long)i+1;
            if(k==0) break;
        }
        if(k>0) sum+=(j+j+k-1)*k/2;
        return sum;
    }
}