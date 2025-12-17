class Solution {
    Integer dp[][];
    public int minimumTotal(List<List<Integer>> triangle) {
        // int n=triangle.size();
        // int dp[][]= new int[n][n];
        // for(int i=0;i<n;i++){
        //     dp[n-1][i]=triangle.get(n-1).get(i);
        // }

        // for(int i=n-2;i>=0;i--){
        //     for(int j=0;j<=i;j++){
        //         int down= dp[i+1][j];
        //         int diag=dp[i+1][j+1];
        //         dp[i][j]=triangle.get(i).get(j)+Math.min(diag,down);
        //     }
        // }
        // return dp[0][0];
     int n=triangle.size();
     dp= new Integer[n][n];
    //  for(int i=0;i<n;i++){
    //      Arrays.fill(dp[i],-1);
    //     }
   return helper(0,0,triangle);
 }
 public int helper(int index,int level,List<List<Integer>> triangle){
     if(level==triangle.size()-1) {
         return triangle.get(level).get(index);
    }
        // if(level>=triangle.size()){
        //     return 0;
        // }
        if(dp[level][index]!=null) return dp[level][index];
        int down=helper(index,level+1,triangle);
        int diag=helper(index+1,level+1,triangle);
        return dp[level][index]=triangle.get(level).get(index)+Math.min(down,diag);

    }
}