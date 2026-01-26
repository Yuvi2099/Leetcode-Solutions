class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>l=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(min==diff){
                List<Integer>h=new ArrayList<>();
                h.add(arr[i]);
                h.add(arr[i+1]);
                l.add(h);
            }
            else if(min>diff){
                min=diff;
                l.clear();
                List<Integer>h=new ArrayList<>();
                h.add(arr[i]);
                h.add(arr[i+1]);
                l.add(h);
            }
        }
        return l;
    }
}