class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder();
        String s=String.valueOf(num);
        boolean ok=false;
        for(char ch:s.toCharArray()){
            if(ch=='6' && ok==false){
                sb.append("9");
                ok=true;
            }
            else sb.append(ch);
        }
        return Integer.parseInt(sb.toString());
    }
}