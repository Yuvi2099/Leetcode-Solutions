class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid[0].length;
        int n=grid.length;
        List<Integer>l=new ArrayList<>();
        for(int[]x:grid){
            for(int i:x) l.add(i);
        }

        int[]arr=new int[l.size()];
        int len=arr.length;
        for(int i=0;i<len;i++){
            arr[(i+k)%len]=l.get(i);
        }

        int idx=0;
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<m;j++){
                list.add(arr[idx++]);
            }
            ans.add(list);
        }
        return ans;
    }
}