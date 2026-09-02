class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=0,even=0;
        for(int i:nums1){
            if(i%2==0) even++;
            else odd++;
        }
        if(odd==nums1.length || even==nums1.length) return true;
        boolean o=(even>0 && odd>0);
        boolean e=(odd==0 || odd>=2);
        return e||o;
    }
}