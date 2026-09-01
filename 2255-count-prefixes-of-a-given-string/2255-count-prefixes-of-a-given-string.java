class Solution {
    public int countPrefixes(String[] words, String s) {
        HashMap<String,Integer>m=new HashMap<>();
        for(String x:words){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        int count=0;
        String t="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            t+=ch;
            if(m.containsKey(t)) count+=m.get(t);
        }
        return count;
    }
}