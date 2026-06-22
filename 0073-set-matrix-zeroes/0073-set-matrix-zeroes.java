class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer>r=new HashSet<>();
        HashSet<Integer>c=new HashSet<>();
        int k=0;
        for(int[]arr:matrix){
            boolean avail=false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    c.add(i);
                    avail=true;
                }
            }
            if(avail) r.add(k);
            k++;
        }
        int p=0;
        for(int[]arr:matrix){
            if(r.contains(p)){
                for(int i=0;i<arr.length;i++) arr[i]=0;
            }
            else{
                for(int i=0;i<arr.length;i++){
                    if(c.contains(i)) arr[i]=0;
                }
            } 
            p++;
        }
    }
}