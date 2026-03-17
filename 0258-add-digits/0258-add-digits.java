class Solution {
    public int addDigits(int num) {
        if(num<=9) return num;
        int sum=0;
        boolean ok=true;
        while(ok==true){
            sum=0;
            while(num>0){
                sum=sum+(num%10);
                num=num/10;
            }
            if(sum<=9) return sum;
            num=sum;
        }
        return sum;
    }
}