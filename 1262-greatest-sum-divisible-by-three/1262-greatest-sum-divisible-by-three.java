class Solution {
    public int maxSumDivThree(int[] nums) {
        List<Integer>r1=new ArrayList<>();
        List<Integer>r2=new ArrayList<>();
        int sum=0;
        for(int i:nums){
            sum+=i;
            if(i%3==1){
                r1.add(i);
            }
            else if(i%3==2){
                r2.add(i);
            }
        }
        if(sum%3==0) return sum;
        Collections.sort(r1);
        Collections.sort(r2);
        int a=Integer.MIN_VALUE;
        int b=Integer.MIN_VALUE;
        if(sum%3==1){
            if(!r1.isEmpty()){
                a=sum-r1.get(0);
            }
            if(r2.size()>=2){
                b=sum-r2.get(0)-r2.get(1);
            }
        }
        else{
             if(!r2.isEmpty()){
                a=sum-r2.get(0);
            }
            if(r1.size()>=2){
                b=sum-r1.get(0)-r1.get(1);
            }
        }
        return Math.max(a,b);
    }
}