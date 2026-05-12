class Solution {
    public int maxProfit(int[] prices) {
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