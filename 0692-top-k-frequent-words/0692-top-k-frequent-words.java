class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String>l=new ArrayList<>();
        List<String>res=new ArrayList<>();
        HashMap<String,Integer>m=new HashMap<>();
        for(String s:words){
            m.put(s,m.getOrDefault(s,0)+1);
            if(l.contains(s)==false){
                l.add(s);
                System.out.println(s);
            }
        }
        Collections.sort(l);
        while(k!=0){
            int max=0;
            int idx=0;
            for(int i=0;i<l.size();i++){
                if(m.get(l.get(i))>max){
                    max=m.get(l.get(i));
                    idx=i;
                }
            }
            res.add(l.get(idx));
            l.remove(l.get(idx));
            k--;
        }
        return res;
    }
}