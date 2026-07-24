class Solution {
    public int convertTime(String current, String correct) {
        int x=Integer.parseInt(current.substring(0,2));
        int y=Integer.parseInt(correct.substring(0,2));
        int a=Integer.parseInt(current.substring(3,5));
        int b=Integer.parseInt(correct.substring(3,5));
        int ops=y-x;
        int diff=b-a;
        if(diff>=0){
            while(diff!=0){
                if(diff>=15) diff-=15;
                else if(diff>=5) diff-=5;
                else diff--;
                ops++;
            }
        }
        else{
            int target=b+60;
            ops--;
            while(target!=a){
                if((target-a)>=15) a+=15;
                else if((target-a)>=5) a+=5;
                else a++;
                ops++;
            }
        }
        return ops;
    }
}