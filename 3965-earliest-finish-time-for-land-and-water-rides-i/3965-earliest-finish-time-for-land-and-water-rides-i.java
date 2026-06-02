class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int fl=landStartTime[i]+landDuration[i];
                int sw=Math.max(waterStartTime[j],fl);
                int fw=sw+waterDuration[j];
                res=Math.min(res,fw);

                int fw2=waterStartTime[j]+waterDuration[j];
                int sl=Math.max(landStartTime[i],fw2);
                int fl2=sl+landDuration[i];
                res=Math.min(res,fl2);
            }
        }
        return res;
    }
}