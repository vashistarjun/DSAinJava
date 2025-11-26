class Solution {
    Integer dp[][];
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp= new Integer[n][2];
        return f(0,0,prices);
    }
    public int f(int index,int buy,int []prices){
        if(index>=prices.length) return 0;
        if(dp[index][buy]!=null) return dp[index][buy];
        if(buy==0){
            return dp[index][buy]=Math.max(-prices[index]+f(index+1,1,prices),f(index+1,0,prices));
        }
        else{
            return dp[index][buy]=Math.max(prices[index]+f(index+2,0,prices),f(index+1,1,prices));
        }
    }
}