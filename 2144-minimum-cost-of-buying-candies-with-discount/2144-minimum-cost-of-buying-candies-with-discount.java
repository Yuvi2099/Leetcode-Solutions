class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res=0,count=0;
        for(int i=cost.length-1;i>=0;i--){
            count++;
            if(count%3!=0) res+=cost[i];
        }
        return res;
    }
}