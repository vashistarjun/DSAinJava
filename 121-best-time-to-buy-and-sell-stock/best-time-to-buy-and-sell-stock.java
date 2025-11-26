class Solution {
    Integer dp[][];
    public int maxProfit(int[] prices) {
        int k=1;
        dp= new Integer[prices.length][2];
        return f(0,0,k,prices);
    }
    public int f(int index,int buy,int k,int prices[]){
        if(index==prices.length || k==0){
            return 0;
        }
        if(dp[index][buy]!=null) return dp[index][buy];
        if(buy==0){
            return dp[index][buy]=Math.max(-prices[index]+f(index+1,1,k,prices),f(index+1,0,k,prices));
        }
        else{
            return dp[index][buy]=Math.max(prices[index]+f(index+1,0,k-1,prices),f(index+1,1,k,prices));
        }
    }
}