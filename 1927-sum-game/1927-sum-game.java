class Solution {
    public boolean sumGame(String s) {
        int n=s.length();
        int mid=n/2;
        int c1=0,c2=0;
        int lsum=0,rsum=0;
        for(int i=0;i<mid;i++){
            char ch=s.charAt(i);
            if(ch=='?') c1++;
            else lsum+=ch-'0';
        }
        for(int i=mid;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='?') c2++;
            else rsum+=ch-'0';
        }
        int count=c1+c2;
        if(count%2!=0) return true;
        int diff=lsum-rsum;
        int change=c2-c1;
        return diff!=(change*9)/2;
    }
}