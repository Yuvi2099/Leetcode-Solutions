class Solution {
    public List<Integer> partitionLabels(String s) {
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)-'a']=i;
        List<Integer>list=new ArrayList<>();
        int l=0,r=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            r=Math.max(r,freq[ch-'a']);
            if(r==i){
                list.add(r-l+1);
                l=i+1;
            }
        }
        return list;
    }
}