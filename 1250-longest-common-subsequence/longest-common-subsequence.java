class Solution {
    Integer dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        dp= new Integer[n][m];
        return helper(0,0,text1,text2,n,m);
    }
    public int helper(int i,int j,String text1,String text2,int n,int m){
        if(i>=n || j>=m) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]=1+helper(i+1,j+1,text1,text2,n,m);
        }
        else{
            return dp[i][j]=Math.max(helper(i,j+1,text1,text2,n,m),helper(i+1,j,text1,text2,n,m));
        }
    }
}