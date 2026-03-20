class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[]arr=score.clone();
        Arrays.sort(arr);
        int x=1;
        HashMap<Integer,String>m=new HashMap<>();
        for(int i=score.length-1;i>=0;i--){
            if(x==1) m.put(arr[i],"Gold Medal");
            else if(x==2) m.put(arr[i],"Silver Medal");
            else if(x==3) m.put(arr[i],"Bronze Medal");
            else{
                m.put(arr[i],String.valueOf(x));
            }
            x++;
        }
        String[]res=new String[score.length];
        for(int i=0;i<score.length;i++){
            res[i]=m.get(score[i]);
        }
        return res;
    }
}