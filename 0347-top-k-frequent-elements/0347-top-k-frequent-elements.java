class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],1)+1);
        }
        List<Integer>v=new ArrayList<>();
        List<Integer>key=new ArrayList<>();
        for(int i:m.keySet()){
            v.add(m.get(i));
            key.add(i);
        }
        int[]res=new int[k];
        int count=0;
        while(count!=k){
            int max=0;
            int idx=0;
            for(int i=0;i<v.size();i++){
                if(max<v.get(i)){
                    max=v.get(i);
                    idx=i;
                }
            }
            res[count]=key.get(idx);
            count++;
            v.remove(idx);
            key.remove(idx);
        }
        return res;
    }
}