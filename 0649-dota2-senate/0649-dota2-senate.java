class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        List<Integer>r=new ArrayList<>();
        List<Integer>d=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R') r.add(i);
            else d.add(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            int ri=r.remove(0);
            int di=d.remove(0);
            if(ri<di) r.add(ri+n);
            else d.add(di+n);
        }
        if(r.isEmpty()) return "Dire";
        return "Radiant";
    }
}