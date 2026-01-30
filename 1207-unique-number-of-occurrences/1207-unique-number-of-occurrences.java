class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:arr){
            if(m.containsKey(i)==false){
                m.put(i,1);
            }
            else{
                m.put(i,m.get(i)+1);
            }
        }
        HashSet<Integer>h=new HashSet<>();
        for(int i:arr){
            h.add(i);
        }
        List<Integer>l=new ArrayList<>();
        for(int i:h){
            if(l.contains(m.get(i))==true){
                return false;
            }
            else{
                l.add(m.get(i));
            }
        }
        return true;
    }
}