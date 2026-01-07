class Solution {
    Integer dp[][];
    public int uniquePaths(int m, int n) {
        dp= new Integer[m+1][n+1];
        return helper(0,0,m,n);
    }
    public int helper(int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=null) return dp[i][j];
        if(i>=m || j>=n) return 0;
        int right=helper(i+1,j,m,n);
        int down=helper(i,j+1,m,n);
        return dp[i][j]=right+down;

    }
}