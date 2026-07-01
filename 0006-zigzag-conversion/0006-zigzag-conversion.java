class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        HashMap<Integer,String>m=new HashMap<>();
        for(int i=1;i<=numRows;i++) m.put(i,"");
        int k=1;
        boolean peak=false;
        for(int i=0;i<s.length();i++){
            String t=String.valueOf(s.charAt(i));
            m.put(k,m.get(k)+t);
            if(k==numRows) peak=true;
            else if(k==1) peak=false;
            if(peak) k--;
            else k++;
        } 
        StringBuilder sb=new StringBuilder();
        for(int x:m.keySet()) sb.append(m.get(x));
        return sb.toString();
    }
}