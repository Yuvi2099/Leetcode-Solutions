class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer>alltime=new HashSet<>();
        HashSet<Integer>current=new HashSet<>();
        for(int i:arr){
            HashSet<Integer>future=new HashSet<>();
            future.add(i);
            for(int j:current) future.add(j|i);
            current=future;
            alltime.addAll(current);
        }
        return alltime.size(); 
    }
}