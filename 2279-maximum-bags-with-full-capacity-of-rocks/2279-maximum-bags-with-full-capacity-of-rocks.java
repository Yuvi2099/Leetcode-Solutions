class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int ans=0;
        int n=rocks.length;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int diff=capacity[i]-rocks[i];
            if(diff==0) ans++;
            else l.add(diff);
        }
        Collections.sort(l);
        int r=0;
        while(r<l.size() && additionalRocks>=l.get(r)){
            additionalRocks-=l.get(r);
            ans++;
            r++;
        }
        return ans;
    }
}