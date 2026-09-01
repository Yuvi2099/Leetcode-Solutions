class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String a=s.substring(i,j+1);
                String b=new StringBuilder(a).reverse().toString();
                if(a.equals(b)) count++;
            }
        }
        return count;
    }
}