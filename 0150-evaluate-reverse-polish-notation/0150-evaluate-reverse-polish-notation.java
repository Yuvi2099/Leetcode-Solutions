class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        String op="+-*/";
        for(String i:tokens){
            if(op.indexOf(i)!=-1){
                int b=st.pop();
                int a=st.pop();
                int res=0;
                if(i.equals("+")==true){
                    res=a+b;
                }
                else if(i.equals("-")==true){
                    res=a-b;
                }
                else if(i.equals("*")==true){
                    res=a*b;
                }
                else if(i.equals("/")==true){
                    res=a/b;
                }
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.peek();
    }
}