class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='(') st.push(0);
            else{
                int r=st.pop();
                int l=st.pop();
                st.push(l+Math.max(2*r,1));
            }
        }
        return st.pop();
    }
}