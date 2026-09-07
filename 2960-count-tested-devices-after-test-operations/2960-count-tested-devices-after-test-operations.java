class Solution {
    public int countTestedDevices(int[] b) {
        int c=0;
        for(int i=0;i<b.length;i++){
            if(b[i]-c>0) c++;
        }
        return c;
    }
}