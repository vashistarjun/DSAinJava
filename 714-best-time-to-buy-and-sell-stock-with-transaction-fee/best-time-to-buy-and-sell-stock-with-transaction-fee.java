class Solution {
    Integer dp[][];
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        dp= new Integer[n][2];
        return f(0,0,prices,fee);
    }
    public int f(int index,int buy,int prices[],int fee){
        if(index==prices.length) return 0;
        if(dp[index][buy]!=null) return dp[index][buy];
        if(buy==0){
            return dp[index][buy]=Math.max(-prices[index]+f(index+1,1,prices,fee),f(index+1,0,prices,fee));
        }
        else{
            return dp[index][buy]=Math.max(prices[index]-fee+f(index+1,0,prices,fee),f(index+1,1,prices,fee));
        }
    }
}