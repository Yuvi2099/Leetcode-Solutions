class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]res=new int[2];
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            m.put(numbers[i],i+1);
        }
        for(int i=0;i<numbers.length;i++){
            int x=target-numbers[i];
            if(m.containsKey(x)){
                res[0]=i+1;
                res[1]=m.get(x);
                break;
            }
        }
        return res;
    }
}