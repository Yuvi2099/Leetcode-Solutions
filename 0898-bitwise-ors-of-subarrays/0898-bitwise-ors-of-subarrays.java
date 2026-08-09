class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer>res=new HashSet<>();
        HashSet<Integer>prev=new HashSet<>();
        for(int i:arr){
            HashSet<Integer>curr=new HashSet<>();
            curr.add(i);
            for(int j:prev) curr.add(j|i);
            prev=curr;
            res.addAll(prev);
        }
        return res.size(); 
    }
}