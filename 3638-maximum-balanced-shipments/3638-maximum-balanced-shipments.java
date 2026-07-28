class Solution {
    public int maxBalancedShipments(int[] weight) {
        int max=0,count=0;
        for(int i=0;i<weight.length;i++){
            if(max<=weight[i]) max=weight[i];
            else{
                count++;
                max=0;
            }
        }
        return count;
    }
}