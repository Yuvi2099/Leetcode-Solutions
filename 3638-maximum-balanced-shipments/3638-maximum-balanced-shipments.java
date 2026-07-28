class Solution {
    public int maxBalancedShipments(int[] weight) {
        int max=0,count=0;
        for(int i=0;i<weight.length;i++){
            max=Math.max(max,weight[i]);
            if(weight[i]<max){
                count++;
                max=0;
            }
        }
        return count;
    }
}