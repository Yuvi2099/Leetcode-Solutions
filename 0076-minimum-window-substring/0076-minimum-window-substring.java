class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        HashMap<Character,Integer>m=new HashMap<>();
        for(char ch:t.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>w=new HashMap<>();
        int need=m.size();
        int min=Integer.MAX_VALUE;
        int have=0;
        int l=0,i=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            w.put(ch,w.getOrDefault(ch,0)+1);
            if(m.containsKey(ch) && w.get(ch).intValue()==m.get(ch).intValue()){
                have++;
            }
            while(have==need){
                if(r-l+1<min){
                    min=r-l+1;
                    i=l;
                }
                char lc=s.charAt(l);
                w.put(lc,w.get(lc)-1);
                if(m.containsKey(lc) && w.get(lc)<m.get(lc)){
                    have--;
                }
                l++;
            }
        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(i,i+min);
    }
}