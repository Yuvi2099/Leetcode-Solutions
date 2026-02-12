class Solution {
    public int missingNumber(int[] nums) {
        int max=0;
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:nums){
            m.put(i,1);
            max=Math.max(max,i);
        }
        for(int i=0;i<=max;i++){
            if(m.containsKey(i)==false){
                return i;
            }
        }
        return max+1;
    }
}