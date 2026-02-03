class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:nums){
            if(m.containsKey(i)){
                m.replace(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        int res=nums[0];
        int max=0;
        for(int i:nums){
            if(m.get(i)>max){
                max=m.get(i);
                res=i;
            }
        }
        return res;
    }
}