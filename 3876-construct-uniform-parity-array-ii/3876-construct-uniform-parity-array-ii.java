class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int n=nums1.length;
        int min=nums1[0];
        int odd=0,even=0;
        for(int i:nums1){
            if(i%2!=0) odd++;
            else even++;
        }
        if(odd==nums1.length || even==nums1.length) return true;
        boolean e=(odd==0 || odd>=2);
        int small=min;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                if(small>=nums1[i]) return false;
            }
        }
        return true;
    }
}