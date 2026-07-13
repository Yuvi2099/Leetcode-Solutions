class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>l=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=9;i++){
            sb.append(i);
            for(int j=i+1;j<=9;j++){
                sb.append(j);
                int x=Integer.parseInt(sb.toString());
                if(x<=high && x>=low) l.add(x);
            }
            sb.setLength(0);
        }
        Collections.sort(l);
        return l;
    }
}