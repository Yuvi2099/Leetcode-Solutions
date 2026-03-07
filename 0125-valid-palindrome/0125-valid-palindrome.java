class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                sb.append(ch);
            }
        }
        StringBuilder tb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                tb.append(ch);
            }
        }
        return sb.toString().equals(tb.toString());
    }
}