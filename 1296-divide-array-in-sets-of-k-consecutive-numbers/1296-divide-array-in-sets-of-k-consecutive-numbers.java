class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0) return false;
        Arrays.sort(nums);
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:nums) m.put(i,m.getOrDefault(i,0)+1);
        for(int i=0;i<n;i++){
            if(m.get(nums[i])>0){
                int num=nums[i];
                for(int j=0;j<k;j++){
                    if(m.containsKey(num) && m.get(num)>0){
                        m.put(num,m.get(num)-1);
                        num++;
                    }
                    else return false;
                }
            }
        }
        return true;
    }
}