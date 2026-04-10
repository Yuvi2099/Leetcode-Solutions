class Solution {
    public int minCost(String colors, int[] neededTime) {
        if(colors.length()==1) return 0;
        int ans=0,l=0;
        char[]arr=colors.toCharArray();
        for(int i=1;i<colors.length();i++){
            if(arr[i]==arr[l]){
                if(neededTime[l]<=neededTime[i]){
                    ans+=neededTime[l];
                    l=i;
                }
                else ans+=neededTime[i];
            }
            else l=i;
        }
        return ans;
    }
}