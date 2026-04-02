class Solution {
    public int minCost(String colors, int[] neededTime) {
        if(colors.length()==1) return 0;
        int res=0;
        char[]arr=colors.toCharArray();
        int l=0,prev=0;
        for(int i=1;i<colors.length();i++){
            if(arr[i]==arr[l]){
                if(neededTime[l]<=neededTime[i]){
                    res+=neededTime[l];
                    l=i;
                }
                else res+=neededTime[i];
            }
            else l=i;
        }
        return res;
    }
}