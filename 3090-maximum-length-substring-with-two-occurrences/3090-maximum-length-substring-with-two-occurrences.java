class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int len=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer>m=new HashMap<>();
            int j=i;
            while(j<n){
                if(m.getOrDefault(s.charAt(j),0)>=2) break;
                else m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
                j++;
            }
            len=Math.max(len,j-i);
        }
        return len;
    }
}