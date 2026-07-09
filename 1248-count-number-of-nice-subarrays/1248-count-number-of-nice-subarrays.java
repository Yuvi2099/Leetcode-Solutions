class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer>f=new HashMap<>();
        f.put(0,1);
        int prefix=0,count=0;
        for(int i:nums){
            prefix+=(i%2);
            count+=f.getOrDefault(prefix-k,0);
            f.put(prefix,f.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}