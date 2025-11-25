class Solution {
    Integer dp[][][];
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp= new Integer[n][2][3];
        return f(0,0,prices,2);       
    }
    public int f(int index,int buy,int prices[],int cap){
        if(index==prices.length || cap==0) return 0;
        if(dp[index][buy][cap]!=null) return dp[index][buy][cap];
        if(buy==0){
            return dp[index][buy][cap]=Math.max(-prices[index]+f(index+1,1,prices,cap),0+f(index+1,0,prices,cap));
        }
        else{
            return dp[index][buy][cap]=Math.max(prices[index]+f(index+1,0,prices,cap-1),f(index+1,1,prices,cap));
        }
    }
}