class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>h=new HashSet<>();
        boolean ok=true;
        while(ok){
            String s=String.valueOf(n);
            int num=0;
            for(char ch:s.toCharArray()){
                int i=Integer.parseInt(String.valueOf(ch));
                num+=i*i;
            }
            n=num;
            if(n<10 && n!=7) ok=false;
            if(h.contains(num)) return false;
            h.add(num);
        }
        return (n==1);
    }
}