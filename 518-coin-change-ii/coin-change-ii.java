class Solution {
    Integer dp[][];
    public int change(int amount, int[] coins) {
        int n=coins.length;
        dp= new Integer[amount+1][n];
        return f(0,amount,coins);
    }
    public int f(int i,int amount,int coins[]){
        if(i==coins.length){
            if(amount==0) return 1;
            return 0;
        }
        if(amount<0) return 0;
        if(dp[amount][i]!=null) return dp[amount][i];
        int ntake=f(i+1,amount,coins);
        int take=f(i,amount-coins[i],coins);
        return dp[amount][i]=ntake+take;
    }
}