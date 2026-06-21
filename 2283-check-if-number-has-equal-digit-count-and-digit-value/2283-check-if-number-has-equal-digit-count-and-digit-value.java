class Solution {
    public boolean digitCount(String num) {
        int[]nums=new int[10];
        for(int i=0;i<num.length();i++){
            nums[num.charAt(i)-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if(nums[i]!=num.charAt(i)-'0') return false;
        }
        return true;
    }
}