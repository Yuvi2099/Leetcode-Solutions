class Solution {
    public int maximumSum(int[] nums) {
        int max=-1;
        HashMap<Integer,List<Integer>>m=new HashMap<>();
        for(int i:nums){
            int d=digitSum(i);
            m.putIfAbsent(d,new ArrayList<>());
            m.get(d).add(i);
        }
        for(List<Integer>l:m.values()){
            if(l.size()>=2){
                l.sort((a,b)-> b-a);
                max=Math.max(max,l.get(0)+l.get(1));
            }
        }
        return max;
    }
    public int digitSum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}