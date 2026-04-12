class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>m=new HashMap<>();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        HashSet<Integer>h=new HashSet<>();
        int res=0;
        for(int i:m.values()){
            if(h.contains(i)){
                while(i>0 && h.contains(i)){
                    res++;
                    i--;
                }
                if(i>0) h.add(i);
            }
            else h.add(i);
        }
        return res;
    }
}