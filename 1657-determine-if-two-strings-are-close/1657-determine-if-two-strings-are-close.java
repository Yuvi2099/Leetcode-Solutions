class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer>m=new HashMap<>();
        for(char ch:word1.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>n=new HashMap<>();
        for(char ch:word2.toCharArray()){
            n.put(ch,n.getOrDefault(ch,0)+1);
        }
        if(!m.keySet().equals(n.keySet())) return false;
        List<Integer>l1=new ArrayList<>(m.values());
        List<Integer>l2=new ArrayList<>(n.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }
}