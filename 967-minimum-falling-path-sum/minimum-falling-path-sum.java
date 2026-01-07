class Solution {
    Integer dp[][];
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        dp= new Integer[n][m];
        int max=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            int mo=helper(0,i,matrix);
            max=Math.min(mo,max);
        }
        return max;
    }
    public int helper(int i,int j,int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;

       if(i<0 || i>=n || j<0 || j>=m) return (int)1e8;
        if(i==n-1 ) return matrix[i][j];
        if(dp[i][j]!=null) return dp[i][j];
       int left=helper(i+1,j-1,matrix);
       int right=helper(i+1,j,matrix);
       int diag=helper(i+1,j+1,matrix);
       return dp[i][j]=matrix[i][j]+Math.min(left,Math.min(right,diag));
    }
}