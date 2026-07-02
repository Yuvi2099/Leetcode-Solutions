class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[]res=new int[n-k+1];
        List<Integer>window=new ArrayList<>();
        for(int i=0;i<k;i++) window.add(nums[i]);
        int idx=0;
        if(isSorted(window)) res[idx]=maxElement(window);
        else res[idx]=-1;
        idx++;
        for(int j=k;j<n;j++){
            window.remove(0);
            window.add(nums[j]);
            if(isSorted(window)) res[idx]=maxElement(window);
            else res[idx]=-1;
            idx++;
        }
        return res;
    }
    private boolean isSorted(List<Integer>window){
        for(int i=1;i<window.size();i++){
            if(window.get(i)!=window.get(i-1)+1) return false;
        }
        return true;
    }
    private int maxElement(List<Integer>window){
        int max=window.get(0);
        for(int i:window) max=Math.max(max,i);
        return max;
    }
}