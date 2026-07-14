class Solution {
    public int maxRepeating(String sequence, String word) {
        int k=0;
        String x=word;
        while(sequence.contains(x)){
            k++;
            x+=word;
        }
        return k;
    }
}