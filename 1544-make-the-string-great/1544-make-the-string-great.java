class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()){
                char bh=st.peek();
                if(ch==bh) st.push(ch);
                else if(Character.isLowerCase(ch) && Character.isUpperCase(bh)){
                    char sh=Character.toLowerCase(bh);
                    if(ch==sh) st.pop();
                    else st.push(ch);
                }
                else if(Character.isLowerCase(bh) && Character.isUpperCase(ch)){
                    char sh=Character.toUpperCase(bh);
                    if(ch==sh) st.pop();
                    else st.push(ch);
                }
                else st.push(ch);
            }
            else st.push(ch);
        }
        String x="";
        for(char ch:st) x+=ch;
        return x;
    }
}