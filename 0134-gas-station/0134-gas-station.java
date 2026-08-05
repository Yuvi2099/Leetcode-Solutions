class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,fuel=0,idx=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                idx=i+1;
                fuel=0;
            }
        }
        if(total>=0) return idx;
        return -1;
    }
}