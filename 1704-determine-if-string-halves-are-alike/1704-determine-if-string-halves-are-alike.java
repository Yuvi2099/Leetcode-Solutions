class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String s1=s.substring(0,n/2);
        String s2=s.substring(n/2,n);
        String check="aeiouAEIOU";
        int count=0;
        for(char ch:s1.toCharArray()){
            if(check.contains(String.valueOf(ch))) count++;
        }
        for(char ch:s2.toCharArray()){
            if(check.contains(String.valueOf(ch))) count--;
        }
        return count==0;
    }
}