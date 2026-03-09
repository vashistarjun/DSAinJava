class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int curr=Integer.MAX_VALUE;
        int n=prices.length;
        for(int i=0;i<n;i++){
            curr=Math.min(curr,prices[i]);
            max=Math.max(max,prices[i]-curr);
        }
        return max;
    }
}