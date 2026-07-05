class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[]arr=new int[n];
        Stack<int[]>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()[0]<temperatures[i]){
                int days=st.pop()[1];
                arr[days]=i-days;
            }
            st.push(new int[]{temperatures[i],i});
        }
        return arr;
    }
}