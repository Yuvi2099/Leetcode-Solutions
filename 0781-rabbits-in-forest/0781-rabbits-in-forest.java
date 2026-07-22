class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:answers){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(int k:m.keySet()){
            int size=k+1;
            int count=m.get(k);
            int groups=(count+size-1)/size;
            sum+=groups*size;
        }
        return sum;
    }
}