class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:arr1) m.put(i,m.getOrDefault(i,0)+1);
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            int count=m.get(arr2[i]);
            for(int j=0;j<count;j++) ans.add(arr2[i]);
        }
        List<Integer>extra=new ArrayList<>();
        for(int i:arr1){
            if(!ans.contains(i)) extra.add(i);
        }
        Collections.sort(extra);
        for(int i:extra) ans.add(i);
        int[]res=new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}