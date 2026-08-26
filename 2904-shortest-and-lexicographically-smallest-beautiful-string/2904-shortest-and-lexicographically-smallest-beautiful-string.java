class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int l=0,c=0;
        int min=Integer.MAX_VALUE;
        String x="";
        for(int r=0;r<n;r++){
            if(s.charAt(r)=='1') c++;
            while(c>k){
                if(s.charAt(l)=='1') c--;
                l++;
            }
            if(c==k){
                while(s.charAt(l)=='0') l++;
                int len=r-l+1;
                String t=s.substring(l,r+1);
                if(len<min || (len==min && t.compareTo(x)<0)){
                    min=len;
                    x=t;
                }
            }
        }
        return x;
    }
}