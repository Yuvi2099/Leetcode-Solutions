class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {
        HashMap<Integer,Set<Integer>>m=new HashMap<>();
        for(int[]x:rs){
            m.computeIfAbsent(x[0],s->new HashSet<>()).add(x[1]);
        }
        int unused=n-m.size();
        int count=2*unused;
        for(Set<Integer>h:m.values()){
            boolean l=true;
            boolean r=true;
            for(int i=2;i<=5;i++){
                if(h.contains(i)){
                    l=false;
                    break;
                }
            }
            for(int i=6;i<=9;i++){
                if(h.contains(i)){
                    r=false;
                    break;
                }
            }
            if(l && r) count+=2;
            else if(l || r) count++;
            else{
                boolean mid=true;
                for(int i=4;i<=7;i++){
                    if(h.contains(i)){
                        mid=false;
                        break;
                    }
                }
                if(mid) count++;
            }
        }
        return count;
    }
}