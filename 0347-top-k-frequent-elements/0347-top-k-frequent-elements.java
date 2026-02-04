class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:nums){
            if(m.containsKey(i)){
                m.replace(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        int[]arr=new int[k];
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        List<Integer>l=new ArrayList<>();
        for(int i:h){
            l.add(i);
        }
        int count=0;
        while(count<k){
            int max=0;
            int idx=0;
            for(int i=0;i<l.size();i++){
                if(m.get(l.get(i))>max){
                    max=m.get(l.get(i));
                    idx=i;
                }
                arr[count]=l.get(idx);
                count++;
                l.remove(l.get(idx));
            }
        }
        return arr;
    }
}