class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int n=technique1.length;
        long sum=0;
        int count=0;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(technique1[i]>=technique2[i]){
                sum=sum+technique1[i];
                count++;
            }
            else{
                sum=sum+technique2[i];
                l.add(technique2[i]-technique1[i]);
            }
        }
        if(count>=k){
            return sum;
        }
        Collections.sort(l);
        for(int i=0;i<k-count;i++){
            sum=sum-l.get(i);
        }
        return sum;
    }
}