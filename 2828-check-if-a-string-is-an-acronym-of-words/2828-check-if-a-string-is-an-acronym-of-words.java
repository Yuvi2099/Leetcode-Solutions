class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(String x:words) sb.append(x.charAt(0));
        String t=sb.toString();
        return s.equals(t);
    }
}