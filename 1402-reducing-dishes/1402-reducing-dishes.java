class Solution {
    public int maxSatisfaction(int[] sts) {
        Arrays.sort(sts);
        int n=sts.length;
        int total=0,sum=0;
        for(int i=n-1;i>=0;i--){
            if(sum+sts[i]>0){
                sum+=sts[i];
                total+=sum;
            }
            else break;
        }
        return total;
    }
}