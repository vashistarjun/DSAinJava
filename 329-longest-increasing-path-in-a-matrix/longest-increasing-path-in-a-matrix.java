class Solution {
    Integer dp[][];
    public int longestIncreasingPath(int[][] matrix) {
        int ans=1;
        int n=matrix.length;
        int m=matrix[0].length;
        dp= new Integer[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                ans=Math.max(ans,f(i,j,matrix));
            }
        }
        return ans;
    }
    public int f(int row,int col,int matrix[][]){
       int max=1;
     
       int dir[][]= {{0,1},{1,0},{-1,0},{0,-1}};
        int n=matrix.length;
        int m=matrix[0].length;
        if(dp[row][col]!=null) return dp[row][col];
       for(int d[]:dir){
        int r=row+d[0];
        int c=col+d[1];
        if(r>=0 && r<n && c>=0 && c<m && 
        matrix[row][col]<matrix[r][c]){
            max=Math.max(max,1+f(r,c,matrix));
        }
       }
      
       return dp[row][col]=max;
    }
}