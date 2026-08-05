class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0) return false;
        Arrays.sort(hand);
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:hand) m.put(i,m.getOrDefault(i,0)+1);
        for(int i:hand){
            if(m.get(i)>0){
                for(int j=0;j<groupSize;j++){
                    int k=i+j;
                    if(!m.containsKey(k) || m.get(k)==0) return false;
                    m.put(k,m.get(k)-1);
                }
            }
        }
        return true;
    }
}