class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0,u=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') l++;
            else if(ch=='R') r++;
            else u++;
        }
        int ans=0;
        if(l>=r) ans=l+u-r;
        else ans=r+u-l;
        return ans;
    }
}