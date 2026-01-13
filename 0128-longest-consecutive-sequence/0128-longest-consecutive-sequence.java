class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        else if(nums.length==0){
            return 0;
        }
        int max=1;
        int count=1;
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        int x=0;
        for(Integer num:h){ //set uses primitive data type to store objects and not in int datatype
            if(h.contains(num-1)==false){//to check if this is the start of sequence
                count=1;
                x=num;
                while(h.contains(x+1)){
                    count++;
                    x++;
                }
            }
            max=Math.max(count,max);
        }
        return max;
    }
}