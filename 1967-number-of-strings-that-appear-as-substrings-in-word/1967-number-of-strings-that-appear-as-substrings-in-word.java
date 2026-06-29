class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String x:patterns){
            if(x.equals(word)) count++;
            else if(word.indexOf(x)!=-1) count++;
        }
        return count;
    }
}