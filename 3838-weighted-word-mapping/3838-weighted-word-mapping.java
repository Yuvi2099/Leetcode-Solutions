class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String x:words){
            int sum=0;
            for(char ch:x.toCharArray()){
                sum+=weights[ch-'a'];
            }
            sum=sum%26;
            char y=(char)('z'-sum);
            sb.append(y);
        }
        return sb.toString();
    }
}