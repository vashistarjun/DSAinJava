class Solution {
    Integer dp[];
    public int climbStairs(int n) {
        dp= new Integer[n+1];
        return f(n);
    }
    public int f(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=null) return dp[n];
        int one=f(n-1);
        int two=f(n-2);
        return dp[n]=(one+two);
    }
}