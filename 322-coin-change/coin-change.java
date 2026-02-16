class Solution {
    Integer dp[][];
    public int coinChange(int[] coins, int amount) {
        dp= new Integer[coins.length][amount+1];
        return f(0,coins,amount)==Integer.MAX_VALUE ? -1 : f(0,coins,amount);
    }
    public int f(int i,int coins[],int amount){
        if(i==coins.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=null) return dp[i][amount];
        int take=f(i,coins,amount-coins[i]);
        if(take!=Integer.MAX_VALUE){
            take=1+take;
        }
        int ntake=0+f(i+1,coins,amount);
        return dp[i][amount]=Math.min(take,ntake);
    }
}