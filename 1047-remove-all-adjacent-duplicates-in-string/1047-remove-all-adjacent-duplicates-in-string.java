class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()){
                char dh=st.peek();
                if(ch==dh) st.pop();
                else st.push(ch);
            }
            else st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st) sb.append(ch);
        return sb.toString();
    }
}