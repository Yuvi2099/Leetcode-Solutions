class Solution {
    public int captureForts(int[] forts) {
        int max=0,n=forts.length;
        for(int i=0;i<n-1;i++){
            if(forts[i]==1){
                int count=0;
                boolean valid=false;
                for(int j=i+1;j<n;j++){
                    if(forts[j]==0) count++;
                    else if(forts[j]==-1){
                        valid=true;
                        break;
                    }
                    else break;
                }
                if(valid) max=Math.max(max,count);
            }
        }
        for(int i=n-1;i>0;i--){
            if(forts[i]==1){
                int count=0;
                boolean valid=false;
                for(int j=i-1;j>=0;j--){
                    if(forts[j]==0) count++;
                    else if(forts[j]==-1){
                        valid=true;
                        break;
                    }
                    else break;
                }
                if(valid) max=Math.max(max,count);
            }
        }
        return max;
    }
}