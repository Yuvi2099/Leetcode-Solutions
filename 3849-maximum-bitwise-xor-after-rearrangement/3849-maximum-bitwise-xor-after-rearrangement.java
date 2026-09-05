class Solution {
    public String maximumXor(String s, String t) {
        HashMap<Character,Integer>m=new HashMap<>();
        for(char ch:t.toCharArray()) m.put(ch,m.getOrDefault(ch,0)+1);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                char dh='1';
                if(m.containsKey(dh) && m.get(dh)>=1){
                    sb.append(dh);
                    m.put(dh,m.get(dh)-1);
                }
                else{
                    sb.append(ch);
                    m.put(ch,m.get(ch)-1);
                }
            }
            else{
                char dh='0';
                if(m.containsKey(dh) && m.get(dh)>=1){
                    sb.append(dh);
                    m.put(dh,m.get(dh)-1);
                }
                else{
                    sb.append(ch);
                    m.put(ch,m.get(ch)-1);
                }
            }
        }
        String r=sb.toString();
        sb.setLength(0);
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'0';
            int y=r.charAt(i)-'0';
            sb.append(x^y);
        }
        return sb.toString();
    }
}