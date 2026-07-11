class Solution {
    public int findComplement(int num) {
        String b=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder();
        for(char ch:b.toCharArray()){
            if(ch=='0') sb.append('1');
            else sb.append('0');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}