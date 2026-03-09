class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        else if(nums.length==1) return 1;
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        int max=1;
        int count=1;
        int x=0;
        for(Integer i:h){
            if(!h.contains(i-1)){
                count=1;
                x=i;
                while(h.contains(x+1)){
                    x++;
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}