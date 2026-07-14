class Solution {
    public String toGoatLatin(String sentence) {
        String[]arr=sentence.split(" ");
        StringBuilder tb=new StringBuilder();
        String add="a";
        String vowel="aeiou";
        for(String x:arr){
            StringBuilder sb=new StringBuilder(x);
            char ch=x.charAt(0);
            ch=Character.toLowerCase(ch);
            if(!vowel.contains(String.valueOf(ch))){
                sb.deleteCharAt(0);
                sb.append(x.charAt(0));
            }
            sb.append("ma");
            sb.append(add);
            tb.append(sb.toString());
            tb.append(" ");
            add+="a";
        }
        tb.deleteCharAt(tb.length()-1);
        return tb.toString();
    }
}