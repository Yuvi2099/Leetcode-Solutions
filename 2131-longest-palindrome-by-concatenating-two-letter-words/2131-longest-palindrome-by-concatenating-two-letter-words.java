class Solution {
    static String pal(String s){
        return ""+s.charAt(1)+s.charAt(0);
    }
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer>m=new HashMap<>();
        for(String x:words){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        int ans=0;
        boolean mid=false;
        for(String x:m.keySet()){
            String y=pal(x);
            if(!y.equals(x)){
                if(m.containsKey(y)){
                    int pairs=Math.min(m.get(x),m.get(y));
                    ans+=pairs*4;
                    m.put(x,m.get(x)-pairs);
                    m.put(y,m.get(y)-pairs);
                }
            }
            else{
                int count=m.get(x);
                ans+=(count/2)*4;
                if(count%2==1 && mid==false){
                    ans+=2;
                    mid=true;
                }
            }
        }
        return ans;
    }
}