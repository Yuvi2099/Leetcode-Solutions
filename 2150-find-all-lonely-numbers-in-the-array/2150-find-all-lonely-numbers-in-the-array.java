class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:nums) m.put(i,m.getOrDefault(i,0)+1);
        List<Integer>l=new ArrayList<>();
        for(int i:nums){
            if(m.get(i)==1){
                if(!m.containsKey(i-1) && !m.containsKey(i+1)) l.add(i);
            }
        }
        return l;
    }
}