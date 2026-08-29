class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[]arr=nums.clone();
        Arrays.sort(arr);
        List<List<Integer>>l=new ArrayList<>();
        Map<Integer,Integer>m=new HashMap<>();
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(i==0 || (arr[i]-arr[i-1]>limit)){
                l.add(new ArrayList<>());
                idx++;
            }
            l.get(idx).add(arr[i]);
            m.put(arr[i],idx);
        }
        int[]brr=new int[l.size()];
        for(int i=0;i<nums.length;i++){
            int curr=m.get(nums[i]);
            nums[i]=l.get(curr).get(brr[curr]);
            brr[curr]++;
        }
        return nums;
    }
}