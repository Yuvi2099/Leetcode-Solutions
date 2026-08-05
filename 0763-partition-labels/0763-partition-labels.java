class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>m=new HashMap<>();
        for(int i=s.length()-1;i>=0;i--){
            if(!m.containsKey(s.charAt(i))) m.put(s.charAt(i),i);
        }
        List<Integer>l=new ArrayList<>();
        int start=0,max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            max=Math.max(max,m.get(ch));
            if(max==i){
                l.add(max-start+1);
                start=i+1;
            }
        }
        return l;
    }
}