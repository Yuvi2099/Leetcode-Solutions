class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        for(int i:colsum){
            if(i==2){
                l1.add(1);
                l2.add(1);
                upper--;
                lower--;
            }
            else{
                l1.add(0);
                l2.add(0);
            }
        }
        for(int i=0;i<colsum.length;i++){
            if(colsum[i]==1){
                if(upper>0){
                    l1.set(i,1);
                    upper--;
                }
                else{
                    l2.set(i,1);
                    lower--;
                }
            }
        }
        if(upper!=0 || lower!=0) return new ArrayList<>();
        list.add(l1);
        list.add(l2);
        return list;
    }
}