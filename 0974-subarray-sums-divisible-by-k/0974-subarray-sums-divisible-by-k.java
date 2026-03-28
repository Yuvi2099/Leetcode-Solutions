class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap<>();
        m.put(0,1);
        int prefix=0,res=0;
        for(int i:nums){
            prefix+=i;
            int mod=((prefix%k)+k)%k;
            res+=m.getOrDefault(mod,0);
            m.put(mod,m.getOrDefault(mod,0)+1);
        }
        return res;
    }
}