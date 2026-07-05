class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[]arr=new int[n];
        Stack<int[]>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()[0]<temperatures[i]){
                int days=st.peek()[1];
                st.pop();
                arr[days]=i-days;
                // int[]prev=st.pop();
                // arr[prev[1]]=i-prev[1];
            }
            st.push(new int[]{temperatures[i],i});
        }
        return arr;
    }
}