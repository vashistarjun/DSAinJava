class Solution {
    Integer dp[][][];
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        dp= new Integer[n][2][k+1];
        return f(0,0,k,prices);
    }
    public int f(int index,int buy,int k,int prices[]){
        if(index==prices.length || k==0) return 0;
        if(dp[index][buy][k]!=null) return dp[index][buy][k];
        if(buy==0){
            return dp[index][buy][k]=Math.max(-prices[index]+f(index+1,1,k,prices),0+f(index+1,0,k,prices));
        }
        else{
            return dp[index][buy][k]=Math.max(prices[index]+f(index+1,0,k-1,prices),f(index+1,1,k,prices));
        }
    }
}