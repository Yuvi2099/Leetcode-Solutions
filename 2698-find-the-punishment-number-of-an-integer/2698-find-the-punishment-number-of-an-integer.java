class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            int x=i*i;
            if(punishmentchecker(String.valueOf(x),0,i)){
                sum=sum+x;
            }
        }
        return sum;
    }
    public boolean punishmentchecker(String s,int idx,int trgt){
        if(idx==s.length()){
            return trgt==0;
        }
        int num=0;
        for(int i=idx;i<s.length();i++){
            num=num*10+(s.charAt(i)-'0');
            if(num>trgt){
                break;
            }
            if(punishmentchecker(s,i+1,trgt-num)){
                return true;
            }
        }
        return false;
    }
}