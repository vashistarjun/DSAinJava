class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        dp= new int[n+1][m+1];
        //return helper(0,0,text1,text2,n,m);
        for(int i=0;i<=n;i++){
            dp[i][m]=0;
        }
        for(int j=0;j<=m;j++){
            dp[n][j]=0;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
    // public int helper(int i,int j,String text1,String text2,int n,int m){
    //     if(i>=n || j>=m) return 0;
    //     if(dp[i][j]!=null) return dp[i][j];
    //     if(text1.charAt(i)==text2.charAt(j)){
    //         return dp[i][j]=1+helper(i+1,j+1,text1,text2,n,m);
    //     }
    //     else{
    //         return dp[i][j]=Math.max(helper(i,j+1,text1,text2,n,m),helper(i+1,j,text1,text2,n,m));
    //     }
    // }
}