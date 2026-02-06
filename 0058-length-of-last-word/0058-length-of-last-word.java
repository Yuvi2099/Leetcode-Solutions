class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)==' ' && sb.length()==0){
                continue;
            }
            else{
                break;
            }
        }
        return sb.length();
    }
}