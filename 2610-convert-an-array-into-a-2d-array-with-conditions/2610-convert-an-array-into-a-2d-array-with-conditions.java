class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        for(int i:nums) l.add(i);
        while(!l.isEmpty()){
            List<Integer>temp=new ArrayList<>();
            HashSet<Integer>h=new HashSet<>();
            for(int i=0;i<l.size();i++){
                int num=l.get(i);
                if(!h.contains(num)){
                    h.add(num);
                    temp.add(num);
                }
            }
            ans.add(temp);
            for(int i:temp) l.remove(Integer.valueOf(i));
        }
        return ans;
    }
}