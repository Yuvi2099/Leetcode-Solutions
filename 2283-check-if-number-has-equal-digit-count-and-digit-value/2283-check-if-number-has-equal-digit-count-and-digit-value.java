class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(char ch:num.toCharArray()){
            int x=Integer.parseInt(String.valueOf(ch));
            m.put(x,m.getOrDefault(x,0)+1);
        }
        for(int i=0;i<num.length();i++){
            int x=Integer.parseInt(String.valueOf(num.charAt(i)));
            int y=0;
            if(m.containsKey(i)==false) y=0;
            else y=m.get(i);
            if(y!=x) return false;
        }
        return true;
    }
}