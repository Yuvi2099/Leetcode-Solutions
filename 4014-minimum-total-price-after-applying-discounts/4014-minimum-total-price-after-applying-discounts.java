class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        double total=0;
        while(i>=0 && j>=0){
            double a=(double)prices[i];
            double b=(double)(100-discounts[j]);
            double c=(a*b)/100;
            total+=c;
            i--;
            j--;

        }
        if(i>=0){
            for(int x=i;x>=0;x--){
                total+=prices[x];
            }
        }
        return total;
    }
}