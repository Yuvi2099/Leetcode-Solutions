class Solution {
    public int minimumPushes(String word) {
        HashSet<Character>h=new HashSet<>();
        for(char ch:word.toCharArray()) h.add(ch);
        int len=h.size();
        HashMap<Character,Integer>m=new HashMap<>();
        for(char ch:word.toCharArray()) m.put(ch,m.getOrDefault(ch,0)+1);
        List<Character>l=new ArrayList<>();
        while(l.size()!=len){
            int max=0;
            char sh='a';
            for(char ch:m.keySet()){
                if(!l.contains(ch) && m.get(ch)>=max){
                    max=m.get(ch);
                    sh=ch;
                }
            }
            l.add(sh);
        }
        int ops=0;
        for(int i=0;i<word.length();i++){
            int idx=l.indexOf(word.charAt(i));
            if(idx<8) ops++;
            else if(idx>7 && idx<16) ops+=2;
            else if(idx>15 && idx<24) ops+=3;
            else ops+=4;
        }
        return ops;
    }
}