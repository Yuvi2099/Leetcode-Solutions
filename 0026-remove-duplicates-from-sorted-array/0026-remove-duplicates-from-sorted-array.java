class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
        int count=0;
        for(int i:nums){
            if(m.containsKey(i)==false){
                m.put(i,1);
                nums[count]=i;
                count++;
            }
        }
        return count;
    }
}