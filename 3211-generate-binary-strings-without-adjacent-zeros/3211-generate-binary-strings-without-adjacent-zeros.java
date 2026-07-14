class Solution {
    public List<String> validStrings(int n) {
        List<String>l=new ArrayList<>();
        construct(new StringBuilder(),n,l);
        return l;
    }
    private void construct(StringBuilder sb, int n, List<String> l){
        if(sb.length()==n){
            l.add(sb.toString());
            return;
        }
        sb.append('1');
        construct(sb,n,l);
        sb.deleteCharAt(sb.length()-1);
        if(sb.length()==0 || sb.charAt(sb.length()-1)=='1'){
            sb.append('0');
            construct(sb,n,l);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}