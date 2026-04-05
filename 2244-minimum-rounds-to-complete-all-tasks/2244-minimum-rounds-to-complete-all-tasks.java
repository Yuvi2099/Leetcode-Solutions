class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:tasks){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(int i:m.keySet()){
            int val=m.get(i);
            if(val==1) return -1;
            if(val>=3){
                if(val%3==0) ans+=val/3;
                else if(val%3==1){
                    val-=4;
                    ans+=2;
                    ans+=val/3;
                }
                else{
                    ans+=val/3;
                    ans++;
                }
            }
            else if(val==2) ans++;
        }
        return ans;
    }
}