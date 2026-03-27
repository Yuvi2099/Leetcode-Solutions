class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n=reward1.length;
        int total=0;
        for(int i:reward2){
            total+=i;
        }
        int[]diff=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=reward1[i]-reward2[i];
        }
        Arrays.sort(diff);
        int l=n-1;
        while(k!=0){
            total+=diff[l];
            l--;
            k--;
        }
        return total;
    }
}