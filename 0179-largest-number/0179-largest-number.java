class Solution {
    public String largestNumber(int[] nums) {
        List<String>l=new ArrayList<>();
        for(int i:nums){
            l.add(String.valueOf(i));
        }
        Collections.sort(l,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb=new StringBuilder();
        for(String s:l){
            sb.append(s);
        }
        String res=sb.toString();
        if(res.charAt(0)=='0') return "0";
        return res;
    }
}