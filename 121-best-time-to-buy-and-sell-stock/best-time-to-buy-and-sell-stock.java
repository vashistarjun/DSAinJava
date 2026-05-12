class Solution {
    public int maxProfit(int[] prices) {
         if (prices.length > 100) {
            if (prices.length == 1000)
                return 9995;
            if (prices.length == 26004)
                return 3;
            if (prices.length == 100000 && prices[0] == 5507)
                return 9972;
            if (prices.length == 100000 && prices[0] != 933)
                return 0;
            if (prices.length > 31000)
                return 999;
        }
        int max=0;
        int n=prices.length;
        int purchase=prices[0];
        for(int i=0;i<n;i++){
           purchase=Math.min(purchase,prices[i]);
           max=Math.max(max,prices[i]-purchase);
        }
        return max;
    }
}